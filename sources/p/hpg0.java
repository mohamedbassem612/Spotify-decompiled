package p;

import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class hpg0 extends c8 {
    public final Object b;
    public Object c;
    public final /* synthetic */ ipg0 d;

    public hpg0(ipg0 ipg0Var, Object obj, Object obj2) {
        super((byte) 0, false);
        this.d = ipg0Var;
        this.b = obj;
        this.c = obj2;
    }

    @Override // p.c8, java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return this.b.equals(entry.getKey()) && this.c.equals(entry.getValue());
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.b;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.c;
    }

    @Override // p.c8, java.util.Map.Entry
    public final int hashCode() {
        return this.c.hashCode() ^ this.b.hashCode();
    }

    @Override // p.c8, java.util.Map.Entry
    public final Object setValue(Object obj) {
        Object objPut = this.d.put(this.b, obj);
        this.c = obj;
        return objPut;
    }
}
