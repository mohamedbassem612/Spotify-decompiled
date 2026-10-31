package com.spotify.genalphagraduation.graduationmessagingimpl;

import android.os.Bundle;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.Metadata;
import p.f710;
import p.gw70;
import p.h0i;
import p.i8h1;
import p.idd1;
import p.j2i;
import p.jik1;
import p.kx40;
import p.l6h1;
import p.lik1;
import p.lzn0;
import p.m830;
import p.mir0;
import p.n6r0;
import p.nik1;
import p.o6r0;
import p.ov20;
import p.p6r0;
import p.rr10;
import p.t3b1;
import p.u890;
import p.ydb;
import p.yon1;
import p.zn41;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/spotify/genalphagraduation/graduationmessagingimpl/ForcedGraduationLockActivity;", "Lp/t3b1;", "Lp/jik1;", "Lp/o6r0;", "<init>", "()V", "src_main_java_com_spotify_genalphagraduation_graduationmessagingimpl-graduationmessagingimpl"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class ForcedGraduationLockActivity extends t3b1 implements jik1, o6r0 {
    public static final /* synthetic */ int n1 = 0;
    public l6h1 f1;
    public i8h1 g1;
    public zn41 h1;
    public lzn0 i1;
    public ov20 j1;
    public gw70 k1;
    public boolean l1;
    public final idd1 m1 = new idd1(new f710(this, (byte) 12));

    public final mir0 c() {
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        return new mir0(kx40.g(yon1.G1("GRADUATION_FORCED", "graduation/forced", 767, "graduation"), nik1.b4.a(), 4));
    }

    public final n6r0 e() {
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        return yon1.G1("GRADUATION_FORCED", "graduation/forced", 767, "graduation");
    }

    public final lik1 getViewUri() {
        return nik1.b4;
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        h0i.a(this, new j2i(-1322306083, new rr10(this, (byte) 13), true));
        J().a(this, new ydb(this, (byte) 9));
        zn41 zn41Var = this.h1;
        if (zn41Var != null) {
            zn41Var.a("forced-graduation-stop-playback", m830.Y);
        } else {
            u890.C("scopeWorkDispatcher");
            throw null;
        }
    }
}
