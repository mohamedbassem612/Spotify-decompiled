package com.spotify.genalpha.accountselectionimpl;

import android.os.Bundle;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.Metadata;
import p.b2r0;
import p.b8k1;
import p.bya0;
import p.ees;
import p.ges;
import p.jik1;
import p.lik1;
import p.mir0;
import p.n6r0;
import p.nik1;
import p.o6r0;
import p.p6r0;
import p.r7k1;
import p.t3b1;
import p.u890;
import p.uba;
import p.w7r0;
import p.yon1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/spotify/genalpha/accountselectionimpl/AccountSelectionActivity;", "Lp/t3b1;", "Lp/jik1;", "Lp/o6r0;", "<init>", "()V", "p/cyo1", "src_main_java_com_spotify_genalpha_accountselectionimpl-accountselectionimpl"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class AccountSelectionActivity extends t3b1 implements jik1, o6r0 {
    public static final /* synthetic */ int i1 = 0;
    public w7r0 f1;
    public ees g1;
    public b2r0 h1;

    public final mir0 c() {
        uba ubaVar = this.h1;
        if (ubaVar != null) {
            return new mir0(ubaVar.a());
        }
        u890.C("pageBoundUbiLogger");
        throw null;
    }

    public final n6r0 e() {
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        return yon1.G1("KID_ACCOUNT_SELECTION", "kid-account-selection", 886, "kid-account-selection");
    }

    public final lik1 getViewUri() {
        return nik1.D3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ees eesVar = this.g1;
        if (eesVar == null) {
            u890.C("pageLoaderViewBuilder");
            throw null;
        }
        ges gesVarA = eesVar.a(this);
        w7r0 w7r0Var = this.f1;
        if (w7r0Var == null) {
            u890.C("pageLoaderScope");
            throw null;
        }
        gesVarA.E(this, w7r0Var.get());
        setContentView(gesVarA);
        bya0 bya0Var = bya0.c;
        WeakHashMap weakHashMap = b8k1.a;
        r7k1.c(gesVarA, bya0Var);
    }
}
