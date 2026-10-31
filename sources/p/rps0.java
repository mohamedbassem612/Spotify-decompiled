package p;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class rps0 extends aa implements u380 {
    public final /* synthetic */ byte a;
    public final m7 b;

    public /* synthetic */ rps0(m7 m7Var, byte b) {
        this.a = b;
        this.b = m7Var;
    }

    public final int b() {
        byte b = this.a;
        dqs0 dqs0Var = this.b;
        switch (b) {
            case 0:
                return ((dps0) dqs0Var).c;
            case 1:
                return ((dps0) dqs0Var).c;
            default:
                return dqs0Var.d.c();
        }
    }

    public final boolean contains(Object obj) {
        Boolean boolValueOf;
        byte b = this.a;
        dqs0 dqs0Var = this.b;
        switch (b) {
            case 0:
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    dps0 dps0Var = (dps0) dqs0Var;
                    Object obj2 = dps0Var.get(entry.getKey());
                    boolValueOf = obj2 != null ? Boolean.valueOf(obj2.equals(entry.getValue())) : null;
                    if (boolValueOf != null) {
                        return boolValueOf.booleanValue();
                    }
                    if (entry.getValue() == null && dps0Var.containsKey(entry.getKey())) {
                        return true;
                    }
                }
                return false;
            case 1:
                return ((dps0) dqs0Var).containsKey(obj);
            default:
                if (obj instanceof Map.Entry) {
                    Map.Entry entry2 = (Map.Entry) obj;
                    dqs0 dqs0Var2 = dqs0Var;
                    Object obj3 = dqs0Var2.get(entry2.getKey());
                    boolValueOf = obj3 != null ? Boolean.valueOf(obj3.equals(entry2.getValue())) : null;
                    if (boolValueOf != null) {
                        return boolValueOf.booleanValue();
                    }
                    if (entry2.getValue() == null) {
                        if (dqs0Var2.d.containsKey(entry2.getKey())) {
                            return true;
                        }
                    }
                }
                return false;
        }
    }

    public final Iterator iterator() {
        byte b = this.a;
        dqs0 dqs0Var = this.b;
        switch (b) {
            case 0:
                jug1 jug1Var = ((dps0) dqs0Var).b;
                lug1[] lug1VarArr = new lug1[8];
                for (int i = 0; i < 8; i++) {
                    lug1VarArr[i] = new nug1((byte) 0);
                }
                return new tps0(jug1Var, lug1VarArr);
            case 1:
                jug1 jug1Var2 = ((dps0) dqs0Var).b;
                lug1[] lug1VarArr2 = new lug1[8];
                for (int i2 = 0; i2 < 8; i2++) {
                    lug1VarArr2[i2] = new nug1((byte) 1);
                }
                return new tps0(jug1Var2, lug1VarArr2);
            default:
                return new hqs0(dqs0Var, (byte) 0);
        }
    }
}
