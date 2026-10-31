package p;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class xuf0 implements g4h1 {
    public final yuf0 a;
    public final suf0 b;

    public xuf0(yuf0 yuf0Var, suf0 suf0Var) {
        this.a = yuf0Var;
        this.b = suf0Var;
    }

    @Override // p.g4h1
    public final f4h1 a(Context context, Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        int i = kgr0.T0;
        return new m1b0(xyn1.z(this.b.a()), this.a, (byte) 1);
    }
}
