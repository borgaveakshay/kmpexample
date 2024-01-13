//
//  AboutScreenView.swift
//  iosApp
//
//  Created by Akshay Borgave on 13/01/2024.
//  Copyright © 2024 orgName. All rights reserved.
//

import SwiftUI
import shared

struct AboutScreenView: View {
    private struct RowItem: Hashable {
        let title: String
        let subTitle: String
    }
    
    private let items: [RowItem] = {
        let platform  = Platform()
        platform.logSystemInfo()
        
        var result: [RowItem] = [
            .init(title: "Operating System", subTitle: platform.osVersion),
            .init(title: "Device Manufacturer", subTitle: platform.deviceManufacturer),
            .init(title: "Device Model", subTitle: "\(platform.deviceModel )")
        ]
        return result 
    }()
    
    var body: some View {
        List{
            ForEach( items , id: \.self){ item in 
                VStack(alignment :.leading){
                    
                    
                }
            }
        } 
    }
}

