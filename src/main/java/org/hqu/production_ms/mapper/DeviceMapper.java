package org.hqu.production_ms.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.hqu.production_ms.domain.Device;
import org.hqu.production_ms.domain.DeviceExample;

public interface DeviceMapper {
	
	//扩展的mapper接口方法
	List<Device> find(Device device);
	
	List<Device> getData();
	
	int deleteBatch(String[] deviceIds);
	
	int updateNote(Device device);

	//根据设备id查找设备信息
	List<Device> searchDeviceByDeviceId(String deviceId);

	//根据设备名称查找设备信息
	List<Device> searchDeviceByDeviceName(String deviceName);

	//根据设备种类名称查找设备信息
	List<Device> searchDeviceByDeviceTypeName(String deviceTypeName);
	
    
	//自动生成的mapper接口方法
	int countByExample(DeviceExample example);

    int deleteByExample(DeviceExample example);

    int deleteByPrimaryKey(String deviceId);

    int insert(Device device);

    int insertSelective(Device record);

    List<Device> selectByExample(DeviceExample example);

    Device selectByPrimaryKey(String deviceId);

    int updateByExampleSelective(@Param("record") Device record, @Param("example") DeviceExample example);

    int updateByExample(@Param("record") Device record, @Param("example") DeviceExample example);

    int updateByPrimaryKeySelective(Device record);

    int updateByPrimaryKey(Device record);
}