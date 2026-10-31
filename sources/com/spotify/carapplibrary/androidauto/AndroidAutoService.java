package com.spotify.carapplibrary.androidauto;

import androidx.car.app.j;
import com.spotify.base.java.logging.Logger;
import kotlin.Metadata;
import p.dma1;
import p.e0q;
import p.j1e1;
import p.kzm0;
import p.oo70;
import p.u890;
import p.wo70;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/spotify/carapplibrary/androidauto/AndroidAutoService;", "Landroidx/car/app/j;", "<init>", "()V", "src_main_java_com_spotify_carapplibrary_androidauto-androidauto"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class AndroidAutoService extends j {
    public e0q d;
    public oo70 e;
    public dma1 f;

    @Override // android.app.Service
    public final void onCreate() {
        j1e1.r(this);
        super.onCreate();
        Logger.b("[AA-LIFECYCLE] AndroidAutoService onCreate", new Object[0]);
        wo70 wo70Var = this.e;
        if (wo70Var == null) {
            u890.C("idleManager");
            throw null;
        }
        wo70Var.a(kzm0.a);
    }

    @Override // androidx.car.app.j, android.app.Service
    public final void onDestroy() {
        Logger.b("[AA-LIFECYCLE] AndroidAutoService onDestroy", new Object[0]);
        wo70 wo70Var = this.e;
        if (wo70Var == null) {
            u890.C("idleManager");
            throw null;
        }
        wo70Var.g(kzm0.a);
        super.onDestroy();
    }
}
