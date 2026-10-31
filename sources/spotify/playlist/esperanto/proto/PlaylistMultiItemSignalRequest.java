package spotify.playlist.esperanto.proto;

import com.google.protobuf.h;
import java.util.ArrayList;
import p.bf40;
import p.h290;
import p.i9;
import p.jf40;
import p.lpu0;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.s8;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class PlaylistMultiItemSignalRequest extends h implements v2j0 {
    private static final PlaylistMultiItemSignalRequest DEFAULT_INSTANCE;
    public static final int ITEM_ID_FIELD_NUMBER = 1;
    public static final int LIST_URI_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER = null;
    public static final int SIGNALS_FIELD_NUMBER = 3;
    private String itemId_ = "";
    private String listUri_ = "";
    private h290 signals_ = h.emptyProtobufList();

    static {
        PlaylistMultiItemSignalRequest playlistMultiItemSignalRequest = new PlaylistMultiItemSignalRequest();
        DEFAULT_INSTANCE = playlistMultiItemSignalRequest;
        h.registerDefaultInstance(PlaylistMultiItemSignalRequest.class, playlistMultiItemSignalRequest);
    }

    private PlaylistMultiItemSignalRequest() {
    }

    public static lpu0 o() {
        return (lpu0) DEFAULT_INSTANCE.createBuilder();
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001Ȉ\u0002Ȉ\u0003\u001b", new Object[]{"itemId_", "listUri_", "signals_", Signal.class});
        }
        if (iOrdinal == 3) {
            return new PlaylistMultiItemSignalRequest();
        }
        if (iOrdinal == 4) {
            return new lpu0(DEFAULT_INSTANCE);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        qzr0 qzr0Var = PARSER;
        if (qzr0Var != null) {
            return qzr0Var;
        }
        synchronized (PlaylistMultiItemSignalRequest.class) {
            try {
                bf40Var = PARSER;
                if (bf40Var == null) {
                    bf40Var = new bf40(DEFAULT_INSTANCE);
                    PARSER = bf40Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return bf40Var;
    }

    public final /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    public final void n(ArrayList arrayList) {
        h290 h290VarMutableCopy = this.signals_;
        if (!((i9) h290VarMutableCopy).a) {
            h290VarMutableCopy = h.mutableCopy(h290VarMutableCopy);
            this.signals_ = h290VarMutableCopy;
        }
        s8.addAll(arrayList, h290VarMutableCopy);
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final void p(String str) {
        str.getClass();
        this.itemId_ = str;
    }

    public final void q(String str) {
        str.getClass();
        this.listUri_ = str;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
