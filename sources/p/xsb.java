package p;

import androidx.datastore.core.CorruptionException;
import com.google.protobuf.InvalidProtocolBufferException;
import com.spotify.listuxplatformconsumers.standard.sections.bottomactions.BottomActionsVisibilityProto$State;
import java.io.FileInputStream;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class xsb implements e761 {
    public static final xsb a = new xsb();
    public static final BottomActionsVisibilityProto$State b = BottomActionsVisibilityProto$State.n();

    public final Object a() {
        return b;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.datastore.core.CorruptionException */
    public final Object b(FileInputStream fileInputStream) throws CorruptionException {
        try {
            BottomActionsVisibilityProto$State bottomActionsVisibilityProto$StateQ = BottomActionsVisibilityProto$State.q(fileInputStream);
            bottomActionsVisibilityProto$StateQ.getClass();
            return bottomActionsVisibilityProto$StateQ;
        } catch (InvalidProtocolBufferException e) {
            throw new CorruptionException("Cannot read stored bottom actions visibility", e);
        }
    }

    public final void c(Object obj, v091 v091Var) {
        ((BottomActionsVisibilityProto$State) obj).writeTo(v091Var);
    }
}
