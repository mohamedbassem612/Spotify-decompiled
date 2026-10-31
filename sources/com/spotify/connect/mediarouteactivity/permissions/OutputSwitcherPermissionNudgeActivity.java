package com.spotify.connect.mediarouteactivity.permissions;

import android.os.Bundle;
import com.spotify.messages.BetamaxPlaybackSession;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.Metadata;
import p.cto1;
import p.fn31;
import p.i2p0;
import p.ior;
import p.iur;
import p.kx40;
import p.lir0;
import p.m0s;
import p.mir0;
import p.mzo;
import p.nik1;
import p.o8n;
import p.p6r0;
import p.rfr;
import p.v4o0;
import p.yon1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/spotify/connect/mediarouteactivity/permissions/OutputSwitcherPermissionNudgeActivity;", "Lp/mzo;", "Lp/lir0;", "<init>", "()V", "src_main_java_com_spotify_connect_mediarouteactivity-mediarouteactivity"}, k = 1, mv = {2, 3, 0}, xi = BetamaxPlaybackSession.CLIENT_METADATA_FIELD_NUMBER)
public final class OutputSwitcherPermissionNudgeActivity extends mzo implements lir0 {
    public ior b1;
    public iur c1;
    public m0s d1;
    public v4o0 e1;
    public rfr f1;

    public final mir0 c() {
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        return new mir0(kx40.g(yon1.G1("CONNECT_OUTPUTSWITCHERDEVICEPICKER", "connect/outputSwitcherDevicePicker", 398, "connect"), nik1.E2.a(), 4));
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        fn31.T(cto1.q(this), (o8n) null, 0, new i2p0(this, null, (byte) 10), 3);
    }
}
