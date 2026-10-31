package p;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class rd8 implements g4h1 {
    public final /* synthetic */ byte a = 1;
    public final cir0 b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;

    public rd8(cir0 cir0Var, q59 q59Var, ymd0 ymd0Var, j2i j2iVar, Function0 function0) {
        this.b = cir0Var;
        this.c = q59Var;
        this.d = ymd0Var;
        this.e = j2iVar;
        this.f = function0;
    }

    public final f4h1 a(Context context, Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        byte b = this.a;
        Object obj = this.f;
        Object obj2 = this.e;
        Object obj3 = this.d;
        Object obj4 = this.c;
        switch (b) {
            case 0:
                return new qd8(layoutInflater.inflate(2131624072, viewGroup, false), (kp5) obj4, (kt91) obj3, (lzn0) obj2, (Activity) context, (ajg) obj, this.b);
            default:
                return new gzj(context, new j2i(-1760032759, new j6c(this.b, new obk1(viewGroup), (q59) obj4, (ymd0) obj3, (j2i) obj2, (Function0) obj, (byte) 1), true));
        }
    }

    public rd8(kp5 kp5Var, kt91 kt91Var, lzn0 lzn0Var, ajg ajgVar, cir0 cir0Var) {
        this.c = kp5Var;
        this.d = kt91Var;
        this.e = lzn0Var;
        this.f = ajgVar;
        this.b = cir0Var;
    }
}
