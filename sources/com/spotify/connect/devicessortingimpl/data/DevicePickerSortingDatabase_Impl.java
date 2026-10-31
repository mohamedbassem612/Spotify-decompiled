package com.spotify.connect.devicessortingimpl.data;

import com.spotify.connect.esperanto.proto.ConnectMessages$StateResponse;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import p.art;
import p.d821;
import p.dyb0;
import p.ec90;
import p.idd1;
import p.lnm;
import p.ots;
import p.rc11;
import p.ss0;
import p.yah0;
import p.z6x;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/spotify/connect/devicessortingimpl/data/DevicePickerSortingDatabase_Impl;", "Lcom/spotify/connect/devicessortingimpl/data/DevicePickerSortingDatabase;", "<init>", "()V", "src_main_java_com_spotify_connect_devicessortingimpl-devicessortingimpl"}, k = 1, mv = {2, 3, 0}, xi = ConnectMessages$StateResponse.Device.SUPPORTS_GAPLESS_FIELD_NUMBER)
public final class DevicePickerSortingDatabase_Impl extends DevicePickerSortingDatabase {
    public final idd1 l = new idd1(new ots(this, (byte) 22));

    @Override // p.en31
    public final void d() {
        a();
        b();
        yah0.x(new d821(this, new String[]{"DeviceLastConnection"}, (lnm) null, (byte) 17));
    }

    @Override // p.en31
    public final List e(LinkedHashMap linkedHashMap) {
        return new ArrayList();
    }

    @Override // p.en31
    public final ec90 f() {
        return new ec90(this, new LinkedHashMap(), new LinkedHashMap(), "DeviceLastConnection");
    }

    @Override // p.en31
    public final dyb0 g() {
        return new ss0(this);
    }

    @Override // p.en31
    public final Set k() {
        return new LinkedHashSet();
    }

    @Override // p.en31
    public final LinkedHashMap l() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(rc11.a.b(art.class), z6x.a);
        return linkedHashMap;
    }

    @Override // com.spotify.connect.devicessortingimpl.data.DevicePickerSortingDatabase
    public final art u() {
        return (art) this.l.getValue();
    }
}
