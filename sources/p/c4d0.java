package p;

import androidx.datastore.core.CorruptionException;
import com.google.protobuf.InvalidProtocolBufferException;
import com.spotify.listplatform.sortingimpl.ListSortingProto$ListSortingStore;
import java.io.FileInputStream;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class c4d0 implements e761 {
    public static final c4d0 a = new c4d0();
    public static final ListSortingProto$ListSortingStore b = ListSortingProto$ListSortingStore.n();

    public final Object a() {
        return b;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.datastore.core.CorruptionException */
    public final Object b(FileInputStream fileInputStream) throws CorruptionException {
        try {
            ListSortingProto$ListSortingStore listSortingProto$ListSortingStoreQ = ListSortingProto$ListSortingStore.q(fileInputStream);
            listSortingProto$ListSortingStoreQ.getClass();
            return listSortingProto$ListSortingStoreQ;
        } catch (InvalidProtocolBufferException e) {
            throw new CorruptionException("Cannot read ListSortingStore proto", e);
        }
    }

    public final void c(Object obj, v091 v091Var) {
        ((ListSortingProto$ListSortingStore) obj).writeTo(v091Var);
    }
}
