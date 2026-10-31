package p;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class i4h1 implements vr20 {
    public final /* synthetic */ vr20 a;
    public final /* synthetic */ j1o b;
    public final /* synthetic */ s880 c;
    public final /* synthetic */ LayoutInflater d;
    public final /* synthetic */ ViewGroup e;
    public final /* synthetic */ Bundle f;
    public final /* synthetic */ mr20 g;

    public i4h1(vr20 vr20Var, j1o j1oVar, s880 s880Var, Context context, LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle, mr20 mr20Var) {
        this.a = vr20Var;
        this.b = j1oVar;
        this.c = s880Var;
        this.d = layoutInflater;
        this.e = viewGroup;
        this.f = bundle;
        this.g = mr20Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object emit(Object obj, lnm lnmVar) {
        h4h1 h4h1Var;
        if (lnmVar instanceof h4h1) {
            h4h1Var = (h4h1) lnmVar;
            int i = h4h1Var.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                h4h1Var.b = i - Integer.MIN_VALUE;
            } else {
                h4h1Var = new h4h1(this, lnmVar);
            }
        } else {
            h4h1Var = new h4h1(this, lnmVar);
        }
        Object obj2 = h4h1Var.a;
        int i2 = h4h1Var.b;
        if (i2 == 0) {
            hm5.M(obj2);
            zob1 zob1VarL = this.b.l();
            kqw kqwVarH = this.c.h(((ddr0) obj).b(), zob1VarL, this.d, this.e, this.f, this.g);
            h4h1Var.b = 1;
            Object objEmit = this.a.emit(kqwVarH, h4h1Var);
            d9n d9nVar = d9n.a;
            if (objEmit == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(obj2);
        }
        return rih1.a;
    }
}
