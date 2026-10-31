package com.spotify.connectivity.httpretrofit;

import java.util.function.UnaryOperator;
import p.cxc;
import p.gc31;
import p.jc31;
import p.jo21;
import p.k370;
import p.l270;
import p.l370;
import p.ne;
import p.yyp0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public class RetrofitMaker {
    private final jc31 mAssertion;
    private final l270 mInternalWebgateCallFactoryBuilder;
    private final gc31 mRetrofitInternalWebgate;
    private final gc31 mRetrofitWebgate;
    private final l270 mWebgateCallFactoryBuilder;

    public RetrofitMaker(gc31 gc31Var, l270 l270Var, gc31 gc31Var2, l270 l270Var2, jc31 jc31Var) {
        this.mRetrofitWebgate = withCallFactoryFrom(gc31Var, l270Var);
        this.mWebgateCallFactoryBuilder = l270Var;
        this.mRetrofitInternalWebgate = withCallFactoryFrom(gc31Var2, l270Var2);
        this.mInternalWebgateCallFactoryBuilder = l270Var2;
        this.mAssertion = jc31Var;
    }

    private static <T> T assertAndCreate(gc31 gc31Var, Class<T> cls, jc31 jc31Var) {
        return (T) gc31Var.b(cls);
    }

    private cxc buildCallFactory(gc31 gc31Var, l270 l270Var, String str, UnaryOperator<l270> unaryOperator) {
        if (l270Var != null) {
            return new jo21(((l270) unaryOperator.apply(l270Var)).c(), str, (byte) 1);
        }
        this.mAssertion.a(str);
        return new jo21(gc31Var.b, str, (byte) 1);
    }

    private <T> T doCreateService(gc31 gc31Var, l270 l270Var, Class<T> cls, String str) {
        cxc cxcVarBuildCallFactory = buildCallFactory(gc31Var, l270Var, str);
        gc31Var.getClass();
        ne neVar = new ne(gc31Var);
        neVar.l(cxcVarBuildCallFactory);
        return (T) assertAndCreate(neVar.j(), cls, this.mAssertion);
    }

    private static gc31 withCallFactoryFrom(gc31 gc31Var, l270 l270Var) {
        if (gc31Var == null || l270Var == null) {
            return gc31Var;
        }
        ne neVar = new ne(gc31Var);
        neVar.l(((yyp0) l270Var).c());
        return neVar.j();
    }

    public <T> T createCustomHostService(Class<T> cls, l370 l370Var) {
        gc31 gc31Var = this.mRetrofitWebgate;
        gc31Var.getClass();
        ne neVar = new ne(gc31Var);
        neVar.h(l370Var);
        return (T) assertAndCreate(neVar.j(), cls, this.mAssertion);
    }

    public <T> T createEarlyAccessWebgateService(Class<T> cls, String str, UnaryOperator<l270> unaryOperator) {
        gc31 gc31Var = this.mRetrofitInternalWebgate;
        return gc31Var != null ? (T) doCreateService(gc31Var, this.mInternalWebgateCallFactoryBuilder, cls, str, unaryOperator) : (T) createWebgateService(cls, str, unaryOperator);
    }

    public <T> T createExperimentalWebgateService(Class<T> cls, String str) {
        k370 k370VarG = this.mRetrofitWebgate.c.g();
        k370VarG.e("exp.wg.spotify.com");
        return (T) createCustomHostService(cls, k370VarG.b(), str);
    }

    public <T> T createWebgateService(Class<T> cls, String str, UnaryOperator<l270> unaryOperator) {
        return (T) doCreateService(this.mRetrofitWebgate, this.mWebgateCallFactoryBuilder, cls, str, unaryOperator);
    }

    public <T> T createWebgateService(Class<T> cls, String str) {
        return (T) doCreateService(this.mRetrofitWebgate, this.mWebgateCallFactoryBuilder, cls, str);
    }

    public RetrofitMaker(gc31 gc31Var, gc31 gc31Var2, jc31 jc31Var) {
        this(gc31Var, null, gc31Var2, null, jc31Var);
    }

    public RetrofitMaker(gc31 gc31Var, l270 l270Var, jc31 jc31Var) {
        this(gc31Var, l270Var, null, null, jc31Var);
    }

    public RetrofitMaker(gc31 gc31Var, jc31 jc31Var) {
        this(gc31Var, null, null, null, jc31Var);
    }

    public <T> T createCustomHostService(Class<T> cls, l370 l370Var, String str) {
        gc31 gc31Var = this.mRetrofitWebgate;
        gc31Var.getClass();
        ne neVar = new ne(gc31Var);
        neVar.h(l370Var);
        return (T) doCreateService(neVar.j(), this.mWebgateCallFactoryBuilder, cls, str);
    }

    public <T> T createEarlyAccessWebgateService(Class<T> cls, String str) {
        gc31 gc31Var = this.mRetrofitInternalWebgate;
        if (gc31Var != null) {
            return (T) doCreateService(gc31Var, this.mInternalWebgateCallFactoryBuilder, cls, str);
        }
        return (T) createWebgateService(cls, str);
    }

    private <T> T doCreateService(gc31 gc31Var, l270 l270Var, Class<T> cls, String str, UnaryOperator<l270> unaryOperator) {
        cxc cxcVarBuildCallFactory = buildCallFactory(gc31Var, l270Var, str, unaryOperator);
        gc31Var.getClass();
        ne neVar = new ne(gc31Var);
        neVar.l(cxcVarBuildCallFactory);
        return (T) assertAndCreate(neVar.j(), cls, this.mAssertion);
    }

    private cxc buildCallFactory(gc31 gc31Var, l270 l270Var, String str) {
        cxc cxcVarC = gc31Var.b;
        if (l270Var != null) {
            cxcVarC = ((yyp0) l270Var).c();
        }
        return new jo21(cxcVarC, str, (byte) 1);
    }
}
