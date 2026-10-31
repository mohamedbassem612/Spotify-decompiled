package p;

import android.os.Bundle;
import android.os.IInterface;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class w5n1 extends q5n1 implements IInterface {
    public final bsd1 l;
    public final /* synthetic */ y5n1 m;
    public final /* synthetic */ byte n;
    public final u7n1 o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ y5n1 f130p;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public w5n1(y5n1 y5n1Var, bsd1 bsd1Var, byte b) {
        this(y5n1Var, bsd1Var, (char) 0);
        this.n = b;
        switch (b) {
            case 1:
                this.f130p = y5n1Var;
                this(y5n1Var, bsd1Var, (char) 0);
                this.o = new u7n1("OnWarmUpIntegrityTokenCallback");
                break;
            default:
                this.f130p = y5n1Var;
                this.o = new u7n1("OnRequestIntegrityTokenCallback");
                break;
        }
    }

    public final void Y0(Bundle bundle) {
        this.m.e.c(this.l);
    }

    public final void Z0(Bundle bundle) {
        this.m.e.c(this.l);
    }

    public w5n1(y5n1 y5n1Var, bsd1 bsd1Var, char c) {
        this.m = y5n1Var;
        attachInterface(this, "com.google.android.play.core.integrity.protocol.IExpressIntegrityServiceCallback");
        this.l = bsd1Var;
    }
}
