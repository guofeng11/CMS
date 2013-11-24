/*
 * 
 *	Copyright © 2013 Changsha Shishuo Network Technology Co., Ltd. All rights reserved.
 *	长沙市师说网络科技有限公司 版权所有
 *	http://www.shishuo.com
 *
 *	Licensed under the Apache License, Version 2.0 (the "License");
 *	you may not use this file except in compliance with the License.
 *	You may obtain a copy of the License at
 *	 
 *		http://www.apache.org/licenses/LICENSE-2.0
 *
 *	Unless required by applicable law or agreed to in writing, software
 *	distributed under the License is distributed on an "AS IS" BASIS,
 *	WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *	See the License for the specific language governing permissions and
 *	limitations under the License.
 */
package com.shishuo.cms.constant;

/**
 * 文件常量
 * 
 * @author Zhang jiale
 * 
 */
public class FileConstant {

	/**
	 * 文件类型
	 * 
	 * @author Herbert
	 * 
	 */
	public static enum TYPE {
		ARTICLE, PHOTO, DOWNLOAD, SHOP
	};

	/**
	 * 是否拥护配图
	 * 
	 * @author Herbert
	 * 
	 */
	public static enum PICTURE {
		NO_EXIST, EXIST
	};

	/**
	 * 文件状态
	 * 
	 * @author Herbert
	 * 
	 */
	public static enum STATUS {
		DISABLE, DISPLAY
	};


}
