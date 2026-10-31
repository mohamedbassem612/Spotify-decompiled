package com.spotify.jvm.jni;

import com.spotify.playlist.policy.proto.PlaylistDecorationPolicy;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/spotify/jvm/jni/NativeClassLoader;", "", "<init>", "()V", "Companion", "src_main_java_com_spotify_jvm_jni-jni"}, k = 1, mv = {2, 3, 0}, xi = PlaylistDecorationPolicy.AI_CURATION_REFERENCE_ID_FIELD_NUMBER)
public final class NativeClassLoader {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0083 ¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\u0003¨\u0006\n"}, d2 = {"Lcom/spotify/jvm/jni/NativeClassLoader$Companion;", "", "<init>", "()V", "Ljava/lang/ClassLoader;", "classLoader", "Lp/rih1;", "setClassLoader", "(Ljava/lang/ClassLoader;)V", "load", "src_main_java_com_spotify_jvm_jni-jni"}, k = 1, mv = {2, 3, 0}, xi = PlaylistDecorationPolicy.AI_CURATION_REFERENCE_ID_FIELD_NUMBER)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final void setClassLoader(ClassLoader classLoader) {
            NativeClassLoader.setClassLoader(classLoader);
        }

        public final void load() {
            setClassLoader(NativeClassLoader.class.getClassLoader());
        }

        private Companion() {
        }
    }

    public static final void load() {
        INSTANCE.load();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final native void setClassLoader(ClassLoader classLoader);
}
