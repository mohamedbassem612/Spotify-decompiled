package p;

import com.google.protobuf.Any;
import io.reactivex.rxjava3.functions.Function;
import java.util.Collections;
import spotify.mdata.proto.Mdata;
import spotify.mdata.proto.Mdata$LocalBatchedExtensionResponse$EntityExtension;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class dtf1 implements Function {
    public final /* synthetic */ etf1 a;

    public dtf1(etf1 etf1Var) {
        this.a = etf1Var;
    }

    public final Object apply(Object obj) {
        Mdata$LocalBatchedExtensionResponse$EntityExtension mdata$LocalBatchedExtensionResponse$EntityExtension;
        byte[] bArrT;
        phc phcVarQ;
        Mdata.LocalBatchedExtensionResponse.Extension extension = (Mdata.LocalBatchedExtensionResponse.Extension) o7h.s0(((Mdata.LocalBatchedExtensionResponse) obj).getExtensionList());
        hz00 extensionKind = extension != null ? extension.getExtensionKind() : null;
        hz00 hz00Var = hz00.i2;
        z6x z6xVar = z6x.a;
        if (extensionKind != hz00Var) {
            return new erq0(z6xVar);
        }
        h290 h290VarN = extension.n();
        if (h290VarN == null || (mdata$LocalBatchedExtensionResponse$EntityExtension = (Mdata$LocalBatchedExtensionResponse$EntityExtension) o7h.s0(h290VarN)) == null) {
            return new erq0(z6xVar);
        }
        int number = hz00Var.getNumber();
        Any anyN = mdata$LocalBatchedExtensionResponse$EntityExtension.n();
        if (anyN == null || (phcVarQ = anyN.q()) == null || (bArrT = phcVarQ.t()) == null) {
            bArrT = new byte[0];
        }
        erq0 erq0VarA = this.a.b.a(Collections.singletonList(new jz00(bArrT, number))).a(erq0.class);
        return erq0VarA == null ? new erq0(z6xVar) : erq0VarA;
    }
}
