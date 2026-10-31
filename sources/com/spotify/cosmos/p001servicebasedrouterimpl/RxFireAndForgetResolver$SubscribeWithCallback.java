package com.spotify.cosmos.p001servicebasedrouterimpl;

import com.spotify.base.java.logging.Logger;
import com.spotify.cosmos.cosmos.Request;
import com.spotify.cosmos.routercallback.ResolverCallbackReceiver;
import com.spotify.cosmos.servicebasedrouterimpl.RxFireAndForgetResolver;
import io.reactivex.rxjava3.core.CompletableObserver;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0003\n\u0002\b\n\b\u0082\u0004\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u00032\u00020\u0004B)\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b¢\u0006\u0004\b\n\u0010\u000bB\u001f\b\u0016\u0012\u0006\u0010\r\u001a\u00020\f\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b¢\u0006\u0004\b\n\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001dR\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001dR\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001eR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lcom/spotify/cosmos/servicebasedrouterimpl/RxFireAndForgetResolver$SubscribeWithCallback;", "", "T", "Lio/reactivex/rxjava3/core/Observer;", "Lio/reactivex/rxjava3/core/CompletableObserver;", "", "action", "uri", "Lcom/spotify/cosmos/routercallback/ResolverCallbackReceiver;", "receiver", "<init>", "(Lcom/spotify/cosmos/servicebasedrouterimpl/RxFireAndForgetResolver;Ljava/lang/String;Ljava/lang/String;Lcom/spotify/cosmos/routercallback/ResolverCallbackReceiver;)V", "Lcom/spotify/cosmos/cosmos/Request;", "request", "(Lcom/spotify/cosmos/servicebasedrouterimpl/RxFireAndForgetResolver;Lcom/spotify/cosmos/cosmos/Request;Lcom/spotify/cosmos/routercallback/ResolverCallbackReceiver;)V", "Lio/reactivex/rxjava3/disposables/Disposable;", "d", "Lp/rih1;", "onSubscribe", "(Lio/reactivex/rxjava3/disposables/Disposable;)V", "response", "onNext", "(Ljava/lang/Object;)V", "", "e", "onError", "(Ljava/lang/Throwable;)V", "onComplete", "()V", "Ljava/lang/String;", "Lcom/spotify/cosmos/routercallback/ResolverCallbackReceiver;", "disposable", "Lio/reactivex/rxjava3/disposables/Disposable;", "src_main_java_com_spotify_cosmos_servicebasedrouterimpl-servicebasedrouterimpl"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class RxFireAndForgetResolver$SubscribeWithCallback<T> implements Observer<T>, CompletableObserver {
    private final String action;
    private Disposable disposable;
    private final ResolverCallbackReceiver<T> receiver;
    final /* synthetic */ RxFireAndForgetResolver this$0;
    private final String uri;

    public RxFireAndForgetResolver$SubscribeWithCallback(RxFireAndForgetResolver rxFireAndForgetResolver, String str, String str2, ResolverCallbackReceiver<T> resolverCallbackReceiver) {
        this.this$0 = rxFireAndForgetResolver;
        this.action = str;
        this.uri = str2;
        this.receiver = resolverCallbackReceiver;
    }

    public void onComplete() {
        Logger.g("%s %s completed", new Object[]{this.uri, this.action});
        Disposable disposable = this.disposable;
        if (disposable != null) {
            RxFireAndForgetResolver rxFireAndForgetResolver = this.this$0;
            disposable.dispose();
            RxFireAndForgetResolver.access$getDisposables$p(rxFireAndForgetResolver).a(disposable);
        }
    }

    public void onError(Throwable e) {
        Logger.g("%s %s failed with message: %s", new Object[]{this.uri, this.action, e.getMessage()});
        this.receiver.sendOnError(e);
        Disposable disposable = this.disposable;
        if (disposable != null) {
            RxFireAndForgetResolver rxFireAndForgetResolver = this.this$0;
            disposable.dispose();
            RxFireAndForgetResolver.access$getDisposables$p(rxFireAndForgetResolver).a(disposable);
        }
    }

    public void onNext(T response) {
        this.receiver.sendOnResolved(response);
    }

    public void onSubscribe(Disposable d) {
        RxFireAndForgetResolver.access$getDisposables$p(this.this$0).b(d);
        this.disposable = d;
    }

    public RxFireAndForgetResolver$SubscribeWithCallback(RxFireAndForgetResolver rxFireAndForgetResolver, Request request, ResolverCallbackReceiver<T> resolverCallbackReceiver) {
        this(rxFireAndForgetResolver, request.getAction(), request.getUri(), resolverCallbackReceiver);
    }
}
