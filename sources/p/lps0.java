package p;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class lps0 extends a9 {
    public final /* synthetic */ byte a;
    public final z8 b;

    public /* synthetic */ lps0(z8 z8Var, byte b) {
        this.a = b;
        this.b = z8Var;
    }

    public final boolean add(Object obj) {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    public final int b() {
        byte b = this.a;
        z8 z8Var = this.b;
        switch (b) {
            case 0:
                return ((hps0) z8Var).f;
            default:
                return ((eqs0) z8Var).d.c();
        }
    }

    public final void clear() {
        byte b = this.a;
        z8 z8Var = this.b;
        switch (b) {
            case 0:
                ((hps0) z8Var).clear();
                break;
            default:
                ((eqs0) z8Var).clear();
                break;
        }
    }

    public final boolean contains(Object obj) {
        Boolean boolValueOf;
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        byte b = this.a;
        z8 z8Var = this.b;
        switch (b) {
            case 0:
                hps0 hps0Var = (hps0) z8Var;
                Object obj2 = hps0Var.get(entry.getKey());
                boolValueOf = obj2 != null ? Boolean.valueOf(obj2.equals(entry.getValue())) : null;
                if (boolValueOf != null) {
                    return boolValueOf.booleanValue();
                }
                if (entry.getValue() != null || !hps0Var.containsKey(entry.getKey())) {
                    return false;
                }
                break;
            default:
                eqs0 eqs0Var = (eqs0) z8Var;
                Object obj3 = eqs0Var.get(entry.getKey());
                boolValueOf = obj3 != null ? Boolean.valueOf(obj3.equals(entry.getValue())) : null;
                if (boolValueOf != null) {
                    return boolValueOf.booleanValue();
                }
                if (entry.getValue() != null) {
                    return false;
                }
                if (!eqs0Var.d.containsKey(entry.getKey())) {
                    return false;
                }
                break;
        }
        return true;
    }

    public final Iterator iterator() {
        byte b = this.a;
        z8 z8Var = this.b;
        switch (b) {
            case 0:
                return new nps0((hps0) z8Var);
            default:
                return new fqs0((eqs0) z8Var, (byte) 0);
        }
    }

    public final boolean remove(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        byte b = this.a;
        z8 z8Var = this.b;
        switch (b) {
            case 0:
                return ((hps0) z8Var).remove(entry.getKey(), entry.getValue());
            default:
                return ((eqs0) z8Var).remove(entry.getKey(), entry.getValue());
        }
    }
}
