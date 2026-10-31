package androidx.datastore.preferences.protobuf;

import p.ac01;
import p.ot11;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public abstract class j {
    public final boolean a(Object obj, ac01 ac01Var) throws InvalidProtocolBufferException {
        int tag = ac01Var.getTag();
        int iE = ot11.E(tag);
        int iF = ot11.F(tag);
        if (iF == 0) {
            ((k) obj).c(ot11.J(iE, 0), Long.valueOf(ac01Var.F()));
            return true;
        }
        if (iF == 1) {
            ((k) obj).c(ot11.J(iE, 1), Long.valueOf(ac01Var.a()));
            return true;
        }
        if (iF == 2) {
            ((k) obj).c(ot11.J(iE, 2), ac01Var.n());
            return true;
        }
        if (iF != 3) {
            if (iF == 4) {
                return false;
            }
            if (iF != 5) {
                throw InvalidProtocolBufferException.b();
            }
            ((k) obj).c(ot11.J(iE, 5), Integer.valueOf(ac01Var.t()));
            return true;
        }
        k kVarB = k.b();
        int iJ = ot11.J(iE, 4);
        while (ac01Var.z() != Integer.MAX_VALUE && a(kVarB, ac01Var)) {
        }
        if (iJ != ac01Var.getTag()) {
            throw new InvalidProtocolBufferException("Protocol message end-group tag did not match expected tag.");
        }
        kVarB.e = false;
        ((k) obj).c(ot11.J(iE, 3), kVarB);
        return true;
    }
}
