package com.spotify.cosmos.servicebasedrouterimpl;

import com.spotify.base.java.logging.Logger;
import com.spotify.connect.esperanto.proto.ConnectMessages$StateResponse;
import com.spotify.cosmos.cosmos.Request;
import com.spotify.cosmos.cosmos.Response;
import com.spotify.cosmos.fireandforgetresolver.FireAndForgetResolver;
import com.spotify.cosmos.routercallback.ResolverCallbackReceiver;
import com.spotify.cosmos.rxrouter.CosmosException;
import com.spotify.cosmos.rxrouter.RxRouter;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.disposables.CompositeDisposable;
import io.reactivex.rxjava3.functions.Consumer;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p.eg;
import p.mmr0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0007\u0018\u0000 \"2\u00020\u0001:\u0002\"#B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\f\u001a\u00020\u00062\u000e\u0010\u000b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\n0\tH\u0016¢\u0006\u0004\b\f\u0010\rJ3\u0010\f\u001a\u00020\u00062\u000e\u0010\u000b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\n0\t2\u0012\u0010\u000f\u001a\u000e\u0012\b\b\u0001\u0012\u0004\u0018\u00010\n\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\f\u0010\u0010J\u001f\u0010\f\u001a\u00020\u00062\u000e\u0010\u000b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\n0\u0011H\u0016¢\u0006\u0004\b\f\u0010\u0012J3\u0010\f\u001a\u00020\u00062\u000e\u0010\u000b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\n0\u00112\u0012\u0010\u000f\u001a\u000e\u0012\b\b\u0001\u0012\u0004\u0018\u00010\n\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\f\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J+\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u00142\u0012\u0010\u000f\u001a\u000e\u0012\b\b\u0001\u0012\u0004\u0018\u00010\n\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0016\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0019\u0010\bJ\u000f\u0010\u001a\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001a\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001bR\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010 \u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!¨\u0006$"}, d2 = {"Lcom/spotify/cosmos/servicebasedrouterimpl/RxFireAndForgetResolver;", "Lcom/spotify/cosmos/fireandforgetresolver/FireAndForgetResolver;", "Lcom/spotify/cosmos/rxrouter/RxRouter;", "rxRouter", "<init>", "(Lcom/spotify/cosmos/rxrouter/RxRouter;)V", "Lp/rih1;", "verifyIsDisposed", "()V", "Lio/reactivex/rxjava3/core/Single;", "Lcom/spotify/cosmos/cosmos/Response;", "query", "detached", "(Lio/reactivex/rxjava3/core/Single;)V", "Lcom/spotify/cosmos/routercallback/ResolverCallbackReceiver;", "resolverCallbackReceiver", "(Lio/reactivex/rxjava3/core/Single;Lcom/spotify/cosmos/routercallback/ResolverCallbackReceiver;)V", "Lio/reactivex/rxjava3/core/Observable;", "(Lio/reactivex/rxjava3/core/Observable;)V", "(Lio/reactivex/rxjava3/core/Observable;Lcom/spotify/cosmos/routercallback/ResolverCallbackReceiver;)V", "Lcom/spotify/cosmos/cosmos/Request;", "request", "resolve", "(Lcom/spotify/cosmos/cosmos/Request;)V", "(Lcom/spotify/cosmos/cosmos/Request;Lcom/spotify/cosmos/routercallback/ResolverCallbackReceiver;)V", "reset", "dispose", "Lcom/spotify/cosmos/rxrouter/RxRouter;", "Lio/reactivex/rxjava3/disposables/CompositeDisposable;", "disposables", "Lio/reactivex/rxjava3/disposables/CompositeDisposable;", "", "disposed", "Z", "Companion", "SubscribeWithCallback", "src_main_java_com_spotify_cosmos_servicebasedrouterimpl-servicebasedrouterimpl"}, k = 1, mv = {2, 3, 0}, xi = ConnectMessages$StateResponse.Device.SUPPORTS_GAPLESS_FIELD_NUMBER)
public final class RxFireAndForgetResolver implements FireAndForgetResolver {
    private final CompositeDisposable disposables = new CompositeDisposable();
    private boolean disposed;
    private final RxRouter rxRouter;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final ResolverCallbackReceiver<Response> NO_OP = ResolverCallbackReceiver.INSTANCE.forAny(null, new Consumer() { // from class: com.spotify.cosmos.servicebasedrouterimpl.RxFireAndForgetResolver$Companion$NO_OP$1
        public final void accept(Response response) {
        }
    }, new Consumer() { // from class: com.spotify.cosmos.servicebasedrouterimpl.RxFireAndForgetResolver$Companion$NO_OP$2
        public final void accept(Throwable th) {
        }
    });
    private static final Request EMPTY_REQUEST = new Request("", "sp://dummy");

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\b2\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0004H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/spotify/cosmos/servicebasedrouterimpl/RxFireAndForgetResolver$Companion;", "", "<init>", "()V", "Lp/mmr0;", "Lcom/spotify/cosmos/cosmos/Request;", "Lcom/spotify/cosmos/cosmos/Response;", "pair", "Lio/reactivex/rxjava3/core/Observable;", "processResponseStatus", "(Lp/mmr0;)Lio/reactivex/rxjava3/core/Observable;", "request", "response", "", "composeErrorMessage", "(Lcom/spotify/cosmos/cosmos/Request;Lcom/spotify/cosmos/cosmos/Response;)Ljava/lang/String;", "Lcom/spotify/cosmos/routercallback/ResolverCallbackReceiver;", "NO_OP", "Lcom/spotify/cosmos/routercallback/ResolverCallbackReceiver;", "EMPTY_REQUEST", "Lcom/spotify/cosmos/cosmos/Request;", "src_main_java_com_spotify_cosmos_servicebasedrouterimpl-servicebasedrouterimpl"}, k = 1, mv = {2, 3, 0}, xi = ConnectMessages$StateResponse.Device.SUPPORTS_GAPLESS_FIELD_NUMBER)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final String composeErrorMessage(Request request, Response response) {
            return request.getAction() + " " + request.getUri() + " : Failed with " + response.getStatus() + " status code.";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Observable<Response> processResponseStatus(mmr0 pair) {
            Request request = (Request) pair.a;
            Object obj = pair.b;
            if (obj != null) {
                Response response = (Response) obj;
                return response.getStatus() >= 400 ? Observable.error(new CosmosException(composeErrorMessage(request, response))) : Observable.just(response);
            }
            eg.m("Required value was null.");
            return null;
        }

        private Companion() {
        }
    }

    public RxFireAndForgetResolver(RxRouter rxRouter) {
        this.rxRouter = rxRouter;
    }

    private final void verifyIsDisposed() {
        if (this.disposed) {
            Logger.e(new IllegalStateException(), "Trying to resolve when FireAndForgetResolver is disposed", new Object[0]);
        }
    }

    @Override // com.spotify.cosmos.fireandforgetresolver.FireAndForgetResolver
    public synchronized void detached(Observable<? extends Response> query, ResolverCallbackReceiver<? extends Response> resolverCallbackReceiver) {
        try {
            Request request = EMPTY_REQUEST;
            if (resolverCallbackReceiver == null) {
                resolverCallbackReceiver = NO_OP;
            }
            query.map(new detached.1(request)).flatMap(new detached.2(INSTANCE)).subscribe(new SubscribeWithCallback(this, request, resolverCallbackReceiver));
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.spotify.cosmos.fireandforgetresolver.FireAndForgetResolver
    public synchronized void dispose() {
        this.disposables.g();
        this.disposed = true;
    }

    @Override // com.spotify.cosmos.fireandforgetresolver.FireAndForgetResolver
    public synchronized void reset() {
        this.disposed = false;
    }

    @Override // com.spotify.cosmos.fireandforgetresolver.FireAndForgetResolver
    public synchronized void resolve(Request request) {
        verifyIsDisposed();
        this.rxRouter.resolve(request).singleOrError().map(new resolve.1(request)).flatMapObservable(new resolve.2(INSTANCE)).subscribe(new SubscribeWithCallback(this, request, NO_OP));
    }

    @Override // com.spotify.cosmos.fireandforgetresolver.FireAndForgetResolver
    public void detached(Single<? extends Response> query, ResolverCallbackReceiver<? extends Response> resolverCallbackReceiver) {
        detached(query.toObservable(), resolverCallbackReceiver);
    }

    @Override // com.spotify.cosmos.fireandforgetresolver.FireAndForgetResolver
    public void detached(Observable<? extends Response> query) {
        detached(query, (ResolverCallbackReceiver<? extends Response>) null);
    }

    @Override // com.spotify.cosmos.fireandforgetresolver.FireAndForgetResolver
    public void detached(Single<? extends Response> query) {
        detached(query.toObservable());
    }

    @Override // com.spotify.cosmos.fireandforgetresolver.FireAndForgetResolver
    public synchronized void resolve(Request request, ResolverCallbackReceiver<? extends Response> resolverCallbackReceiver) {
        try {
            verifyIsDisposed();
            if (resolverCallbackReceiver == null) {
                resolverCallbackReceiver = NO_OP;
            }
            this.rxRouter.resolve(request).subscribe(new SubscribeWithCallback(this, request, resolverCallbackReceiver));
        } catch (Throwable th) {
            throw th;
        }
    }
}
