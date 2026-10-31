package p;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class f6w implements mr20 {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ mr20 b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;

    public f6w(ay8 ay8Var, String str, String str2, String str3, x5w x5wVar, String str4, String str5, Integer num) {
        this.b = ay8Var;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.h = x5wVar;
        this.f = str4;
        this.g = str5;
        this.i = num;
    }

    public final Object collect(vr20 vr20Var, lnm lnmVar) {
        byte b = this.a;
        d9n d9nVar = d9n.a;
        Object obj = this.i;
        Object obj2 = this.h;
        Object obj3 = this.g;
        Object obj4 = this.f;
        Object obj5 = this.e;
        Object obj6 = this.d;
        Object obj7 = this.c;
        qt20 qt20Var = this.b;
        switch (b) {
            case 0:
                ((ay8) qt20Var).collect(new glu(vr20Var, (String) obj7, (String) obj6, (String) obj5, (x5w) obj2, (String) obj4, (String) obj3, (Integer) obj, (byte) 1), lnmVar);
                return d9nVar;
            default:
                Object objCollect = qt20Var.collect(new i4h1(vr20Var, (j1o) obj7, (s880) obj6, (Context) obj5, (LayoutInflater) obj4, (ViewGroup) obj3, (Bundle) obj2, (mr20) obj), lnmVar);
                return objCollect == d9nVar ? objCollect : rih1.a;
        }
    }

    public f6w(qt20 qt20Var, j1o j1oVar, s880 s880Var, Context context, LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle, mr20 mr20Var) {
        this.b = qt20Var;
        this.c = j1oVar;
        this.d = s880Var;
        this.e = context;
        this.f = layoutInflater;
        this.g = viewGroup;
        this.h = bundle;
        this.i = mr20Var;
    }
}
