package p;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class tpk implements i8l {
    public final /* synthetic */ byte a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;

    public /* synthetic */ tpk(Object obj, Object obj2, Object obj3, Object obj4, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    public final h8l a(Context context, Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        byte b = this.a;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (b) {
            case 0:
                return new spk(layoutInflater, (npk) obj3, (p7p) obj4, (cir0) obj, (g1i) obj2);
            default:
                return new co6(layoutInflater, context, (j2e0) obj4, (lzn0) obj3, (kt91) obj2, (rjn0) obj);
        }
    }
}
