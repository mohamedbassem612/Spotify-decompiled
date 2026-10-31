package p;

import com.google.protobuf.Empty;
import com.spotify.audio_sink_chain_wrapper_esperanto.proto.AudioSinkChainWrapperEsperanto$CreateRequest;
import com.spotify.audio_sink_chain_wrapper_esperanto.proto.AudioSinkChainWrapperEsperanto$ReadRequest;
import com.spotify.audio_sink_chain_wrapper_esperanto.proto.AudioSinkChainWrapperEsperanto$WriteRequest;
import com.spotify.connectivity.auth.storage.esperanto.proto.EsStoredUserInfo;
import com.spotify.esperanto.esperanto.ClientBase;
import com.spotify.esperanto.esperanto.Transport;
import io.reactivex.rxjava3.core.Single;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class y48 extends ClientBase {
    public final Transport a;

    public /* synthetic */ y48(Transport transport) {
        super(transport);
        this.a = transport;
    }

    public Single a(AudioSinkChainWrapperEsperanto$CreateRequest audioSinkChainWrapperEsperanto$CreateRequest) {
        return callSingle("spotify.audio_sink_chain_wrapper_esperanto.proto.AudioSinkChainWrapperService", "Create", audioSinkChainWrapperEsperanto$CreateRequest).map(s9w.t);
    }

    public Single b(AudioSinkChainWrapperEsperanto$ReadRequest audioSinkChainWrapperEsperanto$ReadRequest) {
        return callSingle("spotify.audio_sink_chain_wrapper_esperanto.proto.AudioSinkChainWrapperService", "Read", audioSinkChainWrapperEsperanto$ReadRequest).map(ns80.Y);
    }

    public Single c(AudioSinkChainWrapperEsperanto$WriteRequest audioSinkChainWrapperEsperanto$WriteRequest) {
        return callSingle("spotify.audio_sink_chain_wrapper_esperanto.proto.AudioSinkChainWrapperService", "Write", audioSinkChainWrapperEsperanto$WriteRequest).map(bya0.i);
    }

    public Single d(Empty empty) {
        return callSingle("spotify.connectivity.auth.storage.esperanto.proto.AuthStorageClient", "getStoredUser", empty).map(uml1.i);
    }

    public Single e(Empty empty) {
        return callSingle("spotify.connectivity.auth.storage.esperanto.proto.AuthStorageClient", "removeUser", empty).map(pbo1.h);
    }

    public Single f(EsStoredUserInfo.StoredUserInfo storedUserInfo) {
        return callSingle("spotify.connectivity.auth.storage.esperanto.proto.AuthStorageClient", "storeUser", storedUserInfo).map(f331.d);
    }
}
