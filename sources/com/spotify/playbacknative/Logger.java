package com.spotify.playbacknative;

import com.spotify.playlist4.proto.PlaylistSyncReasonProto;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/spotify/playbacknative/Logger;", "", "<init>", "()V", "Companion", "src_main_java_com_spotify_playbacknative_playbacknative-playbacknative"}, k = 1, mv = {2, 3, 0}, xi = PlaylistSyncReasonProto.PlaylistSyncCaller.MULTIGET_ADDITIONAL_RESPONSE_VALUE)
public final class Logger {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0006\"\u00020\u0001H\u0007¢\u0006\u0004\b\t\u0010\nJ+\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0006\"\u00020\u0001H\u0007¢\u0006\u0004\b\u000b\u0010\nJ+\u0010\f\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0006\"\u00020\u0001H\u0007¢\u0006\u0004\b\f\u0010\nJ3\u0010\f\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0006\"\u00020\u0001H\u0007¢\u0006\u0004\b\f\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/spotify/playbacknative/Logger$Companion;", "", "<init>", "()V", "", "s", "", "args", "Lp/rih1;", "d", "(Ljava/lang/String;[Ljava/lang/Object;)V", "e", "w", "", "t", "(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V", "src_main_java_com_spotify_playbacknative_playbacknative-playbacknative"}, k = 1, mv = {2, 3, 0}, xi = PlaylistSyncReasonProto.PlaylistSyncCaller.MULTIGET_ADDITIONAL_RESPONSE_VALUE)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void d(String s, Object... args) {
            Object[] objArrCopyOf = Arrays.copyOf(args, args.length);
            String.format(s, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
        }

        public final void e(String s, Object... args) {
            Object[] objArrCopyOf = Arrays.copyOf(args, args.length);
            String.format(s, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
        }

        public final void w(String s, Object... args) {
            Object[] objArrCopyOf = Arrays.copyOf(args, args.length);
            String.format(s, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
        }

        private Companion() {
        }

        public final void w(Throwable t, String s, Object... args) {
            Object[] objArrCopyOf = Arrays.copyOf(args, args.length);
            String.format(s, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
        }
    }

    public static final void d(String str, Object... objArr) {
        INSTANCE.d(str, objArr);
    }

    public static final void e(String str, Object... objArr) {
        INSTANCE.e(str, objArr);
    }

    public static final void w(String str, Object... objArr) {
        INSTANCE.w(str, objArr);
    }

    public static final void w(Throwable th, String str, Object... objArr) {
        INSTANCE.w(th, str, objArr);
    }
}
