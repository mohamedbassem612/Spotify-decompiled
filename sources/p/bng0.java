package p;

import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public class bng0 implements Map.Entry, ola0 {
    public final /* synthetic */ byte a;
    public final Object b;
    public final Object c;

    public bng0(Object obj, r811 r811Var) {
        this.a = (byte) 2;
        this.b = obj;
        i3r i3rVar = r811Var.b;
        this.c = i3rVar == null ? i3r.a : i3rVar;
    }

    @Override // java.util.Map.Entry
    public boolean equals(Object obj) {
        Map.Entry entry;
        byte b = this.a;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                entry = obj instanceof Map.Entry ? (Map.Entry) obj : null;
                return entry != null && u890.j(entry.getKey(), obj2) && u890.j(entry.getValue(), getValue());
            case 1:
                entry = obj instanceof Map.Entry ? (Map.Entry) obj : null;
                return entry != null && u890.j(entry.getKey(), obj2) && u890.j(entry.getValue(), getValue());
            default:
                return super.equals(obj);
        }
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        byte b = this.a;
        return this.b;
    }

    @Override // java.util.Map.Entry
    public Object getValue() {
        byte b = this.a;
        Object obj = this.c;
        switch (b) {
            case 0:
            case 1:
                return obj;
            default:
                return (k3r) obj;
        }
    }

    @Override // java.util.Map.Entry
    public int hashCode() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                int iHashCode = obj != null ? obj.hashCode() : 0;
                Object value = getValue();
                return iHashCode ^ (value != null ? value.hashCode() : 0);
            case 1:
                int iHashCode2 = obj == null ? 0 : obj.hashCode();
                Object value2 = getValue();
                return iHashCode2 ^ (value2 != null ? value2.hashCode() : 0);
            default:
                return super.hashCode();
        }
    }

    @Override // java.util.Map.Entry
    public Object setValue(Object obj) {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public String toString() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                return pze0.i("=", obj, getValue());
            case 1:
                StringBuilder sb = new StringBuilder();
                sb.append(obj);
                sb.append('=');
                sb.append(getValue());
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ bng0(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }
}
