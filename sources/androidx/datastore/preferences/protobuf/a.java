package androidx.datastore.preferences.protobuf;

import p.jc9;
import p.piy0;
import p.qwg;
import p.tm41;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public abstract class a {
    protected int memoizedHashCode;

    public abstract int a();

    public final int b(tm41 tm41Var) {
        e eVar = (e) this;
        int i = eVar.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int iD = tm41Var.d(this);
        eVar.memoizedSerializedSize = iD;
        return iD;
    }

    public void c(qwg qwgVar) {
        piy0 piy0Var = piy0.c;
        piy0Var.getClass();
        piy0Var.a(getClass()).f(this, jc9.m(qwgVar));
    }
}
