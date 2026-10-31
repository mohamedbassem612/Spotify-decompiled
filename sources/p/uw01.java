package p;

import android.os.Bundle;
import android.text.TextUtils;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class uw01 extends k7o1 {
    public final ltf1 b;
    public final String c;

    public /* synthetic */ uw01(pux0 pux0Var) {
        super(1);
        this.b = new ltf1((i2i1) pux0Var.b);
        this.c = (String) pux0Var.c;
    }

    @Override // p.k7o1
    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putInt("C_T", this.a);
        bundle.putBundle("A", this.b.m());
        String str = this.c;
        if (!TextUtils.isEmpty(str)) {
            bundle.putString("B", str);
        }
        if (!TextUtils.isEmpty(null)) {
            bundle.putString("C", null);
        }
        if (!TextUtils.isEmpty(null)) {
            bundle.putString("E", null);
        }
        return bundle;
    }
}
