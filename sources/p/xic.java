package p;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.data.models.CappingKey;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.data.models.CappingState;
import io.reactivex.rxjava3.functions.Function;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class xic implements Function {
    public static final xic a = new xic();

    public final Object apply(Object obj) {
        mmr0 mmr0Var;
        ArrayList arrayList = new ArrayList();
        for (k0j0 k0j0Var : (List) obj) {
            String strM208fromPersistedValuexZxBVag = CappingKey.INSTANCE.m208fromPersistedValuexZxBVag(k0j0Var.a);
            if (strM208fromPersistedValuexZxBVag != null) {
                CappingKey cappingKeyM201boximpl = CappingKey.m201boximpl(CappingKey.m201boximpl(strM208fromPersistedValuexZxBVag).m207unboximpl());
                CappingState cappingState = k0j0Var.b;
                if (cappingState == null) {
                    cappingState = new CappingState(0, 0L, (Set) null, 7, (DefaultConstructorMarker) null);
                }
                mmr0Var = new mmr0(cappingKeyM201boximpl, cappingState);
            } else {
                mmr0Var = null;
            }
            if (mmr0Var != null) {
                arrayList.add(mmr0Var);
            }
        }
        return sqg0.T(arrayList);
    }
}
