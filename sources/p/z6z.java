package p;

import com.google.protobuf.Any;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.Function;
import java.util.ArrayList;
import java.util.Collections;
import spotify.mdata.proto.Mdata;
import spotify.mdata.proto.Mdata$LocalBatchedExtensionResponse$EntityExtension;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class z6z implements Function {
    public final /* synthetic */ a7z a;

    public z6z(a7z a7zVar) {
        this.a = a7zVar;
    }

    public final Object apply(Object obj) {
        byte[] bArrT;
        Any anyN;
        phc phcVarQ;
        Mdata.LocalBatchedExtensionResponse.Extension extension = (Mdata.LocalBatchedExtensionResponse.Extension) o7h.s0(((Mdata.LocalBatchedExtensionResponse) obj).getExtensionList());
        hz00 extensionKind = extension != null ? extension.getExtensionKind() : null;
        hz00 hz00Var = hz00.N0;
        ArrayList arrayList = z6x.a;
        if (extensionKind != hz00Var) {
            return Single.just(arrayList);
        }
        h290<Mdata$LocalBatchedExtensionResponse$EntityExtension> h290VarN = extension.n();
        if (h290VarN != null) {
            arrayList = new ArrayList();
            for (Mdata$LocalBatchedExtensionResponse$EntityExtension mdata$LocalBatchedExtensionResponse$EntityExtension : h290VarN) {
                int number = hz00.N0.getNumber();
                if (mdata$LocalBatchedExtensionResponse$EntityExtension == null || (anyN = mdata$LocalBatchedExtensionResponse$EntityExtension.n()) == null || (phcVarQ = anyN.q()) == null || (bArrT = phcVarQ.t()) == null) {
                    bArrT = new byte[0];
                }
                mdz mdzVarA = this.a.b.a(Collections.singletonList(new jz00(bArrT, number))).a(mdz.class);
                if (mdzVarA != null) {
                    arrayList.add(mdzVarA);
                }
            }
        }
        return Single.just(arrayList);
    }
}
