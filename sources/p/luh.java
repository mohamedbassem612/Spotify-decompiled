package p;

import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class luh extends c8 {
    public final Object b;
    public int c;
    public final /* synthetic */ muh d;

    public luh(muh muhVar, int i) {
        super((byte) 0, false);
        this.d = muhVar;
        Object obj = muh.t;
        this.b = muhVar.k()[i];
        this.c = i;
    }

    public final void a() {
        int i = this.c;
        Object obj = this.b;
        muh muhVar = this.d;
        if (i != -1 && i < muhVar.size()) {
            if (zno1.k(obj, muhVar.k()[this.c])) {
                return;
            }
        }
        Object obj2 = muh.t;
        this.c = muhVar.e(obj);
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.b;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        muh muhVar = this.d;
        Map mapC = muhVar.c();
        if (mapC != null) {
            return mapC.get(this.b);
        }
        a();
        int i = this.c;
        if (i == -1) {
            return null;
        }
        return muhVar.l()[i];
    }

    @Override // p.c8, java.util.Map.Entry
    public final Object setValue(Object obj) {
        muh muhVar = this.d;
        Map mapC = muhVar.c();
        Object obj2 = this.b;
        if (mapC != null) {
            return mapC.put(obj2, obj);
        }
        a();
        int i = this.c;
        if (i == -1) {
            muhVar.put(obj2, obj);
            return null;
        }
        Object obj3 = muhVar.l()[i];
        muhVar.l()[this.c] = obj;
        return obj3;
    }
}
