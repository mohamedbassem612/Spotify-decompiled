package com.spotify.apprater.appraterdialog;

import android.content.Intent;
import android.os.Bundle;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.Metadata;
import p.ajg;
import p.h0i;
import p.j2i;
import p.kx40;
import p.mir0;
import p.mv5;
import p.nik1;
import p.p6r0;
import p.t3b1;
import p.u890;
import p.yon1;
import p.zym0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/spotify/apprater/appraterdialog/AppRaterActivity;", "Lp/t3b1;", "<init>", "()V", "src_main_java_com_spotify_apprater_appraterdialog-appraterdialog"}, k = 1, mv = {2, 3, SplitInstallErrorCode.NO_ERROR}, xi = 48)
public final class AppRaterActivity extends t3b1 {
    public static final /* synthetic */ int g1 = 0;
    public ajg f1;

    public final mir0 c() {
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        return new mir0(kx40.g(yon1.G1("APPRATER", "apprater", 152, "apprater"), nik1.Q2.a(), 4));
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        zym0 zym0Var = this.f1;
        if (zym0Var != null) {
            h0i.a(this, new j2i(594474131, new mv5(this, new Intent("android.intent.action.VIEW", zym0Var.b()), (byte) 2), true));
        } else {
            u890.C("clientInfo");
            throw null;
        }
    }
}
