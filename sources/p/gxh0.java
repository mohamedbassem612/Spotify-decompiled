package p;

import android.os.Bundle;
import java.util.HashSet;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class gxh0 {
    public static final qa61 g;
    public static final m8u0 h;
    public final boolean a;
    public final qa61 b;
    public final m8u0 c;
    public final b380 d;
    public final b380 e;
    public final Bundle f;

    static {
        int i;
        HashSet hashSet = new HashSet();
        bg11 bg11Var = pa61.d;
        int i2 = 0;
        while (true) {
            int size = bg11Var.size();
            i = bg11Var.d;
            if (i2 >= size) {
                break;
            }
            hashSet.add(new pa61(((Integer) bg11Var.get(i2)).intValue()));
            i2++;
        }
        bg11 bg11Var2 = pa61.e;
        for (int i3 = 0; i3 < bg11Var2.size(); i3++) {
            hashSet.add(new pa61(((Integer) bg11Var2.get(i3)).intValue()));
        }
        new qa61(hashSet);
        HashSet hashSet2 = new HashSet();
        for (int i4 = 0; i4 < i; i4++) {
            hashSet2.add(new pa61(((Integer) bg11Var.get(i4)).intValue()));
        }
        new qa61(hashSet2);
        dr41 dr41Var = new dr41();
        bg11 bg11Var3 = pa61.f;
        dr41Var.f(bg11Var3);
        dr41Var.f(pa61.g);
        dr41Var.f(pa61.d);
        dr41Var.f(pa61.e);
        g = dr41Var.h();
        HashSet hashSet3 = new HashSet();
        for (int i5 = 0; i5 < bg11Var3.d; i5++) {
            hashSet3.add(new pa61(((Integer) bg11Var3.get(i5)).intValue()));
        }
        for (int i6 = 0; i6 < i; i6++) {
            hashSet3.add(new pa61(((Integer) bg11Var.get(i6)).intValue()));
        }
        new qa61(hashSet3);
        l8u0 l8u0Var = new l8u0();
        l8u0Var.b();
        h = l8u0Var.d();
        l8u0 l8u0Var2 = new l8u0();
        l8u0Var2.a.d(l8u0.b);
        l8u0Var2.d();
    }

    public gxh0(boolean z, qa61 qa61Var, m8u0 m8u0Var, b380 b380Var, b380 b380Var2, Bundle bundle) {
        this.a = z;
        this.b = qa61Var;
        this.c = m8u0Var;
        this.d = b380Var;
        this.e = b380Var2;
        this.f = bundle;
    }

    public static gxh0 a(qa61 qa61Var, m8u0 m8u0Var) {
        return new gxh0(true, qa61Var, m8u0Var, null, null, null);
    }
}
