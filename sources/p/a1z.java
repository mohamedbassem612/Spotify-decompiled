package p;

import java.util.Arrays;
import kotlinx.serialization.SerializationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class a1z implements nma0 {
    public final Enum[] a;
    public q0z b;
    public final idd1 c;

    public a1z(String str, Enum[] enumArr) {
        this.a = enumArr;
        this.c = new idd1(new og(this, str, (byte) 21));
    }

    @Override // p.nma0
    public final Object deserialize(dar darVar) {
        int iT = darVar.T(getDescriptor());
        Enum[] enumArr = this.a;
        if (iT >= 0 && iT < enumArr.length) {
            return enumArr[iT];
        }
        throw new SerializationException(iT + " is not among valid " + getDescriptor().h() + " enum values, values size is " + enumArr.length);
    }

    @Override // p.nma0
    public final h661 getDescriptor() {
        return (h661) this.c.getValue();
    }

    @Override // p.nma0
    public final void serialize(uax uaxVar, Object obj) {
        Enum r5 = (Enum) obj;
        Enum[] enumArr = this.a;
        int iP0 = f46.p0(enumArr, r5);
        if (iP0 != -1) {
            uaxVar.r(getDescriptor(), iP0);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(r5);
        String strH = getDescriptor().h();
        String string = Arrays.toString(enumArr);
        sb.append(" is not a valid enum ");
        sb.append(strH);
        sb.append(", must be one of ");
        sb.append(string);
        throw new SerializationException(sb.toString());
    }

    public final String toString() {
        return "kotlinx.serialization.internal.EnumSerializer<" + getDescriptor().h() + '>';
    }
}
