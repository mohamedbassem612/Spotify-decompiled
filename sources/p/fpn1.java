package p;

import java.util.Arrays;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public enum fpn1 {
    RESPONSE_CODE_UNSPECIFIED(-999),
    /* JADX INFO: Fake field, exist only in values array */
    SERVICE_TIMEOUT(-3),
    /* JADX INFO: Fake field, exist only in values array */
    FEATURE_NOT_SUPPORTED(-2),
    /* JADX INFO: Fake field, exist only in values array */
    SERVICE_DISCONNECTED(-1),
    /* JADX INFO: Fake field, exist only in values array */
    OK(0),
    /* JADX INFO: Fake field, exist only in values array */
    USER_CANCELED(1),
    /* JADX INFO: Fake field, exist only in values array */
    SERVICE_UNAVAILABLE(2),
    /* JADX INFO: Fake field, exist only in values array */
    BILLING_UNAVAILABLE(3),
    /* JADX INFO: Fake field, exist only in values array */
    ITEM_UNAVAILABLE(4),
    /* JADX INFO: Fake field, exist only in values array */
    DEVELOPER_ERROR(5),
    /* JADX INFO: Fake field, exist only in values array */
    ERROR(6),
    /* JADX INFO: Fake field, exist only in values array */
    ITEM_ALREADY_OWNED(7),
    /* JADX INFO: Fake field, exist only in values array */
    ITEM_NOT_OWNED(8),
    /* JADX INFO: Fake field, exist only in values array */
    EXPIRED_OFFER_TOKEN(11),
    /* JADX INFO: Fake field, exist only in values array */
    NETWORK_ERROR(12);

    public static final mmn1 c;
    public final int a;

    static {
        dna1 dna1Var = new dna1();
        dna1Var.b = new Object[8];
        dna1Var.a = 0;
        for (fpn1 fpn1Var : values()) {
            Integer numValueOf = Integer.valueOf(fpn1Var.a);
            int i = dna1Var.a + 1;
            Object[] objArrCopyOf = (Object[]) dna1Var.b;
            int length = objArrCopyOf.length;
            int i2 = i + i;
            if (i2 > length) {
                if (i2 > length) {
                    length = length + (length >> 1) + 1;
                    if (length < i2) {
                        int iHighestOneBit = Integer.highestOneBit(i2 - 1);
                        length = iHighestOneBit + iHighestOneBit;
                    }
                    if (length < 0) {
                        length = Integer.MAX_VALUE;
                    }
                }
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, length);
                dna1Var.b = objArrCopyOf;
            }
            int i3 = dna1Var.a;
            int i4 = i3 + i3;
            objArrCopyOf[i4] = numValueOf;
            objArrCopyOf[i4 + 1] = fpn1Var;
            dna1Var.a = i3 + 1;
        }
        hsn1 hsn1Var = (hsn1) dna1Var.c;
        if (hsn1Var != null) {
            throw hsn1Var.a();
        }
        mmn1 mmn1VarD = mmn1.d(dna1Var.a, (Object[]) dna1Var.b, dna1Var);
        hsn1 hsn1Var2 = (hsn1) dna1Var.c;
        if (hsn1Var2 != null) {
            throw hsn1Var2.a();
        }
        c = mmn1VarD;
    }

    fpn1(int i) {
        this.a = i;
    }
}
