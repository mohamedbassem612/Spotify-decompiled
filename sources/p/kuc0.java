package p;

import androidx.datastore.core.CorruptionException;
import com.google.protobuf.InvalidProtocolBufferException;
import com.spotify.listplatform.filteringimpl.ListFilteringProto$ListFilteringStore;
import java.io.FileInputStream;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class kuc0 implements e761 {
    public static final kuc0 a = new kuc0();
    public static final ListFilteringProto$ListFilteringStore b = ListFilteringProto$ListFilteringStore.n();

    public final Object a() {
        return b;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.datastore.core.CorruptionException */
    public final Object b(FileInputStream fileInputStream) throws CorruptionException {
        try {
            ListFilteringProto$ListFilteringStore listFilteringProto$ListFilteringStoreP = ListFilteringProto$ListFilteringStore.p(fileInputStream);
            listFilteringProto$ListFilteringStoreP.getClass();
            return listFilteringProto$ListFilteringStoreP;
        } catch (InvalidProtocolBufferException e) {
            throw new CorruptionException("Cannot read ListFilteringStore proto", e);
        }
    }

    public final void c(Object obj, v091 v091Var) {
        ((ListFilteringProto$ListFilteringStore) obj).writeTo(v091Var);
    }
}
