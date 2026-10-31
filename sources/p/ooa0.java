package p;

import android.content.Context;
import android.util.AttributeSet;
import java.util.HashMap;
import java.util.HashSet;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public abstract class ooa0 {
    public int a = -1;
    public int b = -1;
    public String c = null;
    public byte d;
    public HashMap e;

    public abstract void a(HashMap map);

    @Override // 
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public abstract ooa0 clone();

    public ooa0 c(ooa0 ooa0Var) {
        this.a = ooa0Var.a;
        this.b = ooa0Var.b;
        this.c = ooa0Var.c;
        this.d = ooa0Var.d;
        this.e = ooa0Var.e;
        return this;
    }

    public abstract void e(Context context, AttributeSet attributeSet);

    public void d(HashSet hashSet) {
    }

    public void f(HashMap map) {
    }
}
