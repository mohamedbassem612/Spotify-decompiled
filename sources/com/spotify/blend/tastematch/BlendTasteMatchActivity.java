package com.spotify.blend.tastematch;

import android.os.Bundle;
import android.os.Parcelable;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.Metadata;
import p.a2k;
import p.hf4;
import p.jik1;
import p.kx40;
import p.l1d;
import p.lik1;
import p.mir0;
import p.p6r0;
import p.rg30;
import p.t3b1;
import p.u890;
import p.yon1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/spotify/blend/tastematch/BlendTasteMatchActivity;", "Lp/t3b1;", "Lp/jik1;", "<init>", "()V", "src_main_java_com_spotify_blend_tastematch-tastematch"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class BlendTasteMatchActivity extends t3b1 implements jik1 {
    public static final /* synthetic */ int h1 = 0;
    public hf4 f1;
    public a2k g1;

    public final mir0 c() {
        p6r0 p6r0VarG0;
        hf4 hf4Var = this.f1;
        if (hf4Var == null) {
            u890.C("properties");
            throw null;
        }
        if (hf4Var.b()) {
            AtomicReferenceArray atomicReferenceArray = p6r0.e;
            p6r0VarG0 = yon1.G1("BLEND_INVITATION_GROUPBLENDSJOIN", "blend/invitation/groupblendsjoin", 221, "blend");
        } else {
            AtomicReferenceArray atomicReferenceArray2 = p6r0.e;
            p6r0VarG0 = yon1.g0();
        }
        return new mir0(kx40.g(p6r0VarG0, null, 4));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final lik1 getViewUri() {
        hf4 hf4Var = this.f1;
        if (hf4Var == null) {
            u890.C("properties");
            throw null;
        }
        if (!hf4Var.b()) {
            return new lik1("spotify:blend:taste-matchV2");
        }
        String stringExtra = getIntent().getStringExtra("key-invitation-token");
        Parcelable.Creator creator = lik1.CREATOR;
        return new lik1(l1d.m("spotify:internal:groupblendsjoin:", stringExtra));
    }

    public final rg30 l0() {
        a2k a2kVar = this.g1;
        if (a2kVar != null) {
            return a2kVar;
        }
        u890.C("compositeFragmentFactory");
        throw null;
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        hf4 hf4Var = this.f1;
        if (hf4Var == null) {
            u890.C("properties");
            throw null;
        }
        if (hf4Var.b()) {
            setContentView(2131625066);
        } else {
            setContentView(2131624090);
        }
    }
}
