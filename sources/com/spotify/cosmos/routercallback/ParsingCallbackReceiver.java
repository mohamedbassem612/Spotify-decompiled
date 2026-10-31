package com.spotify.cosmos.routercallback;

import android.os.Handler;
import com.spotify.cosmos.cosmos.Response;
import com.spotify.cosmos.parsers.ParserException;
import kotlin.Metadata;
import p.r0z;
import p.t0z;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001\u001bB\u0011\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0011\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0015\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\u0018\u0010\u0014J\u0017\u0010\u0019\u001a\u00028\u00002\u0006\u0010\b\u001a\u00020\u0003H$¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u0013\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00028\u0000H$¢\u0006\u0004\b\u0013\u0010\fJ#\u0010\u0016\u001a\u00020\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH$¢\u0006\u0004\b\u0016\u0010\u0012¨\u0006\u001c"}, d2 = {"Lcom/spotify/cosmos/routercallback/ParsingCallbackReceiver;", "T", "Lcom/spotify/cosmos/routercallback/ResolverCallbackReceiver;", "Lcom/spotify/cosmos/cosmos/Response;", "Landroid/os/Handler;", "handler", "<init>", "(Landroid/os/Handler;)V", "response", "parsedObject", "Lp/rih1;", "postResult", "(Lcom/spotify/cosmos/cosmos/Response;Ljava/lang/Object;)V", "", "error", "Lcom/spotify/cosmos/routercallback/ParsingCallbackReceiver$ErrorCause;", "cause", "postError", "(Ljava/lang/Throwable;Lcom/spotify/cosmos/routercallback/ParsingCallbackReceiver$ErrorCause;)V", "onResolved", "(Lcom/spotify/cosmos/cosmos/Response;)V", "sendOnResolved", "onError", "(Ljava/lang/Throwable;)V", "verifyResponse", "parseResponse", "(Lcom/spotify/cosmos/cosmos/Response;)Ljava/lang/Object;", "ErrorCause", "src_main_java_com_spotify_cosmos_routercallback-routercallback"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class ParsingCallbackReceiver<T> extends ResolverCallbackReceiver<Response> {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/spotify/cosmos/routercallback/ParsingCallbackReceiver$ErrorCause;", "", "<init>", "(Ljava/lang/String;I)V", "RESOLVING", "PARSING", "UNKNOWN", "src_main_java_com_spotify_cosmos_routercallback-routercallback"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public enum ErrorCause {
        RESOLVING,
        PARSING,
        UNKNOWN;

        private static final /* synthetic */ r0z $ENTRIES = new t0z(values());

        public static r0z getEntries() {
            return $ENTRIES;
        }
    }

    public ParsingCallbackReceiver(Handler handler) {
        super(handler);
    }

    private final void postError(final Throwable error, final ErrorCause cause) {
        Handler handler = getHandler();
        if (handler != null) {
            handler.post(new Runnable(this) { // from class: com.spotify.cosmos.routercallback.ParsingCallbackReceiver.postError.1
                final /* synthetic */ ParsingCallbackReceiver<T> this$0;

                {
                    this.this$0 = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.this$0.onError(error, cause);
                }
            });
        } else {
            onError(error, cause);
        }
    }

    private final void postResult(final Response response, final T parsedObject) {
        Handler handler = getHandler();
        if (handler != null) {
            handler.post(new Runnable(this) { // from class: com.spotify.cosmos.routercallback.ParsingCallbackReceiver.postResult.1
                final /* synthetic */ ParsingCallbackReceiver<T> this$0;

                {
                    this.this$0 = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.this$0.onResolved(response, parsedObject);
                }
            });
        } else {
            onResolved(response, parsedObject);
        }
    }

    public void onError(Throwable error) {
        postError(error, ErrorCause.RESOLVING);
    }

    public abstract void onError(Throwable error, ErrorCause cause);

    public void onResolved(Response response) {
        try {
            verifyResponse(response);
            postResult(response, parseResponse(response));
        } catch (ParserException e) {
            postError(e, ErrorCause.PARSING);
        }
    }

    public abstract void onResolved(Response response, T parsedObject);

    public abstract T parseResponse(Response response);

    public void verifyResponse(Response response) {
    }

    public void sendOnResolved(Response response) {
        onResolved(response);
    }
}
