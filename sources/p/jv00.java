package p;

import com.google.protobuf.InvalidProtocolBufferException;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class jv00 extends tu00 {
    public final pv00 b;
    public final LinkedHashMap c;
    public final LinkedHashMap d;

    public jv00(pv00 pv00Var, List list) {
        this.b = pv00Var;
        List<jz00> list2 = list;
        int iS = zno1.s(q7h.U(list2, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(iS < 16 ? 16 : iS);
        for (jz00 jz00Var : list2) {
            linkedHashMap.put(Integer.valueOf(jz00Var.a), jz00Var.b);
        }
        this.c = linkedHashMap;
        this.d = new LinkedHashMap();
    }

    @Override // p.tu00
    public final ez00 a(Class cls) {
        LinkedHashMap linkedHashMap = this.d;
        ez00 ez00Var = (ez00) linkedHashMap.get(cls);
        if (ez00Var != null) {
            return ez00Var;
        }
        try {
            ov00 ov00VarA = this.b.a(cls);
            if (ov00VarA == null) {
                return null;
            }
            byte[] bArr = (byte[]) this.c.get(Integer.valueOf(ov00VarA.b()));
            ez00 ez00VarA = bArr != null ? ov00VarA.a(bArr) : null;
            if (ez00VarA != null) {
                linkedHashMap.put(cls, ez00VarA);
            }
            return ez00VarA;
        } catch (InvalidProtocolBufferException e) {
            n57.g("Failed to parse extended metadata of type '" + cls.getName() + "'", e);
            return null;
        }
    }

    @Override // p.tu00
    public final Map b() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tu00)) {
            return false;
        }
        LinkedHashMap linkedHashMap = this.c;
        tu00 tu00Var = (tu00) obj;
        if (linkedHashMap.size() != tu00Var.b().size()) {
            return false;
        }
        if (linkedHashMap.isEmpty()) {
            return true;
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            int iIntValue = ((Number) entry.getKey()).intValue();
            byte[] bArr = (byte[]) entry.getValue();
            byte[] bArr2 = (byte[]) tu00Var.b().get(Integer.valueOf(iIntValue));
            if (bArr2 == null || !Arrays.equals(bArr, bArr2)) {
                return false;
            }
        }
        return true;
    }

    @Override // p.tu00
    public final int hashCode() {
        LinkedHashMap linkedHashMap = this.c;
        int size = linkedHashMap.size();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            size = (size ^ Integer.hashCode(((Number) entry.getKey()).intValue())) ^ Arrays.hashCode((byte[]) entry.getValue());
        }
        return size;
    }
}
