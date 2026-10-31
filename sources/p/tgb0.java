package p;

import androidx.datastore.core.CorruptionException;
import com.google.protobuf.InvalidProtocolBufferException;
import com.spotify.listentitymusic.page.lastvisited.LastVisitedProto$LastVisitedStore;
import java.io.FileInputStream;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class tgb0 implements e761 {
    public static final tgb0 a = new tgb0();
    public static final LastVisitedProto$LastVisitedStore b = LastVisitedProto$LastVisitedStore.n();

    public final Object a() {
        return b;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.datastore.core.CorruptionException */
    public final Object b(FileInputStream fileInputStream) throws CorruptionException {
        try {
            LastVisitedProto$LastVisitedStore lastVisitedProto$LastVisitedStoreQ = LastVisitedProto$LastVisitedStore.q(fileInputStream);
            lastVisitedProto$LastVisitedStoreQ.getClass();
            return lastVisitedProto$LastVisitedStoreQ;
        } catch (InvalidProtocolBufferException e) {
            throw new CorruptionException("Cannot read LastVisitedStore proto", e);
        }
    }

    public final void c(Object obj, v091 v091Var) {
        ((LastVisitedProto$LastVisitedStore) obj).writeTo(v091Var);
    }
}
