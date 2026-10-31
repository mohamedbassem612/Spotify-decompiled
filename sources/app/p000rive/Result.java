package app.p000rive;

import com.comscore.streaming.ContentType;
import java.util.List;
import kotlin.Metadata;
import p.adt;
import p.b0k;
import p.cy30;
import p.eg;
import p.hab0;
import p.iu30;
import p.mmr0;
import p.u890;
import p.vu30;
import p.x340;
import p.xu30;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u001c\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002:\u0003\u001c\u001d\u001eJ5\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u0000\"\u0004\b\u0001\u0010\u00032\u0018\u0010\u0005\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00000\u0004H\u0017¢\u0006\u0004\b\u0006\u0010\u0007J/\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00010\u0000\"\u0004\b\u0001\u0010\u00032\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004H\u0016¢\u0006\u0004\b\t\u0010\nJI\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00020\u0000\"\u0004\b\u0001\u0010\u000b\"\u0004\b\u0002\u0010\u00032\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\u0018\u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J5\u0010\u000f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00110\u0000\"\u0004\b\u0001\u0010\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00010\u0000H\u0016¢\u0006\u0004\b\u000f\u0010\u0012JE\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00020\u0000\"\u0004\b\u0001\u0010\u000b\"\u0004\b\u0002\u0010\u0003*\b\u0012\u0004\u0012\u00028\u00010\u00002\u0018\u0010\u0005\u001a\u0014\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\u00000\u0004H\u0017¢\u0006\u0004\b\u0006\u0010\u0013JY\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00030\u0000\"\u0004\b\u0001\u0010\u0014\"\u0004\b\u0002\u0010\u0015\"\u0004\b\u0003\u0010\u0003*\b\u0012\u0004\u0012\u00028\u00010\u00002\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00020\u00002\u0018\u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\rH\u0017¢\u0006\u0004\b\u000f\u0010\u0016JE\u0010\u000f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00110\u0000\"\u0004\b\u0001\u0010\u0014\"\u0004\b\u0002\u0010\u0015*\b\u0012\u0004\u0012\u00028\u00010\u00002\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00020\u0000H\u0017¢\u0006\u0004\b\u000f\u0010\u0017J1\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00190\u0000\"\u0004\b\u0001\u0010\u000b*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00000\u0018H\u0017¢\u0006\u0004\b\u001a\u0010\u001b\u0082\u0001\u0003\u001f !¨\u0006\""}, d2 = {"Lapp/rive/Result;", "T", "", "R", "Lkotlin/Function1;", "onSuccess", "andThen", "(Lp/xu30;Lp/b0k;I)Lapp/rive/Result;", "transform", "map", "(Lp/iu30;)Lapp/rive/Result;", "U", "other", "Lkotlin/Function2;", "combine", "zip", "(Lapp/rive/Result;Lp/vu30;)Lapp/rive/Result;", "Lp/mmr0;", "(Lapp/rive/Result;)Lapp/rive/Result;", "(Lapp/rive/Result;Lp/xu30;Lp/b0k;I)Lapp/rive/Result;", "A", "B", "(Lapp/rive/Result;Lapp/rive/Result;Lp/vu30;)Lapp/rive/Result;", "(Lapp/rive/Result;Lapp/rive/Result;)Lapp/rive/Result;", "", "", "sequence", "(Ljava/lang/Iterable;)Lapp/rive/Result;", "Error", "Loading", "Success", "Lapp/rive/Result$Error;", "Lapp/rive/Result$Loading;", "Lapp/rive/Result$Success;", "kotlin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface Result<T> {

    /* JADX INFO: renamed from: app.rive.Result$zip$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u0000\"\u0006\b\u0001\u0010\u0001 \u00012\u0006\u0010\u0002\u001a\u00028\u00012\u0006\u0010\u0003\u001a\u00028\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"U", "T", "value", "otherValue", "Lp/mmr0;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Lp/mmr0;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class AnonymousClass1 extends hab0 implements vu30 {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(2);
        }

        public final mmr0 invoke(T t, U u) {
            return new mmr0(t, u);
        }
    }

    @adt
    <U, R> Result<R> andThen(Result<? extends U> result, xu30 xu30Var, b0k b0kVar, int i);

    <R> Result<R> andThen(xu30 xu30Var, b0k b0kVar, int i);

    <R> Result<R> map(iu30 transform);

    @adt
    <U> Result<List<U>> sequence(Iterable<? extends Result<? extends U>> iterable);

    <U> Result<mmr0> zip(Result<? extends U> other);

    @adt
    <A, B> Result<mmr0> zip(Result<? extends A> result, Result<? extends B> result2);

    @adt
    <A, B, R> Result<R> zip(Result<? extends A> result, Result<? extends B> result2, vu30 vu30Var);

    <U, R> Result<R> zip(Result<? extends U> other, vu30 combine);

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\t\u0010\b\u001a\u00020\u0004HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0004HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lapp/rive/Result$Error;", "Lapp/rive/Result;", "", "throwable", "", "(Ljava/lang/Throwable;)V", "getThrowable", "()Ljava/lang/Throwable;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "kotlin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Error implements Result {
        public static final int $stable = 8;
        private final Throwable throwable;

        public Error(Throwable th) {
            this.throwable = th;
        }

        public static /* synthetic */ Error copy$default(Error error, Throwable th, int i, Object obj) {
            if ((i & 1) != 0) {
                th = error.throwable;
            }
            return error.copy(th);
        }

        @Override // app.p000rive.Result
        @adt
        public <U, R> Result<R> andThen(Result<? extends U> result, xu30 xu30Var, b0k b0kVar, int i) {
            return DefaultImpls.andThen(this, result, xu30Var, b0kVar, i);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final Throwable getThrowable() {
            return this.throwable;
        }

        public final Error copy(Throwable throwable) {
            return new Error(throwable);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Error) && u890.j(this.throwable, ((Error) other).throwable);
        }

        public final Throwable getThrowable() {
            return this.throwable;
        }

        public int hashCode() {
            return this.throwable.hashCode();
        }

        @Override // app.p000rive.Result
        public <R> Result<R> map(iu30 iu30Var) {
            return DefaultImpls.map(this, iu30Var);
        }

        @Override // app.p000rive.Result
        @adt
        public <U> Result<List<U>> sequence(Iterable<? extends Result<? extends U>> iterable) {
            return DefaultImpls.sequence(this, iterable);
        }

        public String toString() {
            return "Error(throwable=" + this.throwable + ")";
        }

        @Override // app.p000rive.Result
        public <U> Result<mmr0> zip(Result<? extends U> result) {
            return DefaultImpls.zip(this, result);
        }

        @Override // app.p000rive.Result
        public <R> Result<R> andThen(xu30 xu30Var, b0k b0kVar, int i) {
            return DefaultImpls.andThen(this, xu30Var, b0kVar, i);
        }

        @Override // app.p000rive.Result
        @adt
        public <A, B> Result<mmr0> zip(Result<? extends A> result, Result<? extends B> result2) {
            return DefaultImpls.zip(this, result, result2);
        }

        @Override // app.p000rive.Result
        @adt
        public <A, B, R> Result<R> zip(Result<? extends A> result, Result<? extends B> result2, vu30 vu30Var) {
            return DefaultImpls.zip(this, result, result2, vu30Var);
        }

        @Override // app.p000rive.Result
        public <U, R> Result<R> zip(Result<? extends U> result, vu30 vu30Var) {
            return DefaultImpls.zip(this, result, vu30Var);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lapp/rive/Result$Loading;", "Lapp/rive/Result;", "", "()V", "kotlin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Loading implements Result {
        public static final int $stable = 0;
        public static final Loading INSTANCE = new Loading();

        private Loading() {
        }

        @Override // app.p000rive.Result
        @adt
        public <U, R> Result<R> andThen(Result<? extends U> result, xu30 xu30Var, b0k b0kVar, int i) {
            return DefaultImpls.andThen(this, result, xu30Var, b0kVar, i);
        }

        @Override // app.p000rive.Result
        public <R> Result<R> map(iu30 iu30Var) {
            return DefaultImpls.map(this, iu30Var);
        }

        @Override // app.p000rive.Result
        @adt
        public <U> Result<List<U>> sequence(Iterable<? extends Result<? extends U>> iterable) {
            return DefaultImpls.sequence(this, iterable);
        }

        @Override // app.p000rive.Result
        public <U> Result<mmr0> zip(Result<? extends U> result) {
            return DefaultImpls.zip(this, result);
        }

        @Override // app.p000rive.Result
        public <R> Result<R> andThen(xu30 xu30Var, b0k b0kVar, int i) {
            return DefaultImpls.andThen(this, xu30Var, b0kVar, i);
        }

        @Override // app.p000rive.Result
        @adt
        public <A, B> Result<mmr0> zip(Result<? extends A> result, Result<? extends B> result2) {
            return DefaultImpls.zip(this, result, result2);
        }

        @Override // app.p000rive.Result
        @adt
        public <A, B, R> Result<R> zip(Result<? extends A> result, Result<? extends B> result2, vu30 vu30Var) {
            return DefaultImpls.zip(this, result, result2, vu30Var);
        }

        @Override // app.p000rive.Result
        public <U, R> Result<R> zip(Result<? extends U> result, vu30 vu30Var) {
            return DefaultImpls.zip(this, result, vu30Var);
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00028\u0001¢\u0006\u0002\u0010\u0004J\u000e\u0010\b\u001a\u00028\u0001HÆ\u0003¢\u0006\u0002\u0010\u0006J\u001e\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\b\b\u0002\u0010\u0003\u001a\u00028\u0001HÆ\u0001¢\u0006\u0002\u0010\nJ\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0013\u0010\u0003\u001a\u00028\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0013"}, d2 = {"Lapp/rive/Result$Success;", "T", "Lapp/rive/Result;", "value", "(Ljava/lang/Object;)V", "getValue", "()Ljava/lang/Object;", "Ljava/lang/Object;", "component1", "copy", "(Ljava/lang/Object;)Lapp/rive/Result$Success;", "equals", "", "other", "", "hashCode", "", "toString", "", "kotlin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Success<T> implements Result<T> {
        public static final int $stable = 0;
        private final T value;

        public Success(T t) {
            this.value = t;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Success copy$default(Success success, Object obj, int i, Object obj2) {
            if ((i & 1) != 0) {
                obj = success.value;
            }
            return success.copy(obj);
        }

        @Override // app.p000rive.Result
        @adt
        public <U, R> Result<R> andThen(Result<? extends U> result, xu30 xu30Var, b0k b0kVar, int i) {
            return DefaultImpls.andThen(this, result, xu30Var, b0kVar, i);
        }

        public final T component1() {
            return this.value;
        }

        public final Success<T> copy(T value) {
            return new Success<>(value);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Success) && u890.j(this.value, ((Success) other).value);
        }

        public final T getValue() {
            return this.value;
        }

        public int hashCode() {
            T t = this.value;
            if (t == null) {
                return 0;
            }
            return t.hashCode();
        }

        @Override // app.p000rive.Result
        public <R> Result<R> map(iu30 iu30Var) {
            return DefaultImpls.map(this, iu30Var);
        }

        @Override // app.p000rive.Result
        @adt
        public <U> Result<List<U>> sequence(Iterable<? extends Result<? extends U>> iterable) {
            return DefaultImpls.sequence(this, iterable);
        }

        public String toString() {
            return cy30.m("Success(value=", this.value, ")");
        }

        @Override // app.p000rive.Result
        public <U> Result<mmr0> zip(Result<? extends U> result) {
            return DefaultImpls.zip(this, result);
        }

        @Override // app.p000rive.Result
        public <R> Result<R> andThen(xu30 xu30Var, b0k b0kVar, int i) {
            return DefaultImpls.andThen(this, xu30Var, b0kVar, i);
        }

        @Override // app.p000rive.Result
        @adt
        public <A, B> Result<mmr0> zip(Result<? extends A> result, Result<? extends B> result2) {
            return DefaultImpls.zip(this, result, result2);
        }

        @Override // app.p000rive.Result
        @adt
        public <A, B, R> Result<R> zip(Result<? extends A> result, Result<? extends B> result2, vu30 vu30Var) {
            return DefaultImpls.zip(this, result, result2, vu30Var);
        }

        @Override // app.p000rive.Result
        public <U, R> Result<R> zip(Result<? extends U> result, vu30 vu30Var) {
            return DefaultImpls.zip(this, result, vu30Var);
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class DefaultImpls {
        public static <T, R> Result<R> andThen(Result<? extends T> result, xu30 xu30Var, b0k b0kVar, int i) {
            x340 x340Var = (x340) b0kVar;
            x340Var.i0(1691355175);
            if (result instanceof Loading) {
                result = Loading.INSTANCE;
            } else if (!(result instanceof Error)) {
                if (!(result instanceof Success)) {
                    eg.o();
                    return null;
                }
                result = (Result<R>) ((Result) xu30Var.invoke(((Success) result).getValue(), x340Var, Integer.valueOf((i << 3) & ContentType.LONG_FORM_ON_DEMAND)));
            }
            x340Var.r(false);
            return (Result<R>) result;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static <T, R> Result<R> map(Result<? extends T> result, iu30 iu30Var) {
            if (result instanceof Loading) {
                return Loading.INSTANCE;
            }
            if (result instanceof Error) {
                return result;
            }
            if (result instanceof Success) {
                return new Success(iu30Var.invoke(((Success) result).getValue()));
            }
            eg.o();
            return null;
        }

        @adt
        public static <T, U> Result<List<U>> sequence(Result<? extends T> result, Iterable<? extends Result<? extends U>> iterable) {
            return ResultKt.sequenceResults(iterable);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static <T, U, R> Result<R> zip(Result<? extends T> result, Result<? extends U> result2, vu30 vu30Var) {
            if (result instanceof Loading) {
                return Loading.INSTANCE;
            }
            if (result instanceof Error) {
                return result;
            }
            if (!(result instanceof Success)) {
                eg.o();
                return null;
            }
            if (result2 instanceof Loading) {
                return Loading.INSTANCE;
            }
            if (result2 instanceof Error) {
                return result2;
            }
            if (result2 instanceof Success) {
                return new Success(vu30Var.invoke(((Success) result).getValue(), ((Success) result2).getValue()));
            }
            eg.o();
            return null;
        }

        @adt
        public static <T, U, R> Result<R> andThen(Result<? extends T> result, Result<? extends U> result2, xu30 xu30Var, b0k b0kVar, int i) {
            x340 x340Var = (x340) b0kVar;
            x340Var.i0(-807316462);
            Result<R> resultAndThen = result2.andThen(xu30Var, x340Var, ((i >> 3) & 14) | ((i << 3) & ContentType.LONG_FORM_ON_DEMAND));
            x340Var.r(false);
            return resultAndThen;
        }

        public static <T, U> Result<mmr0> zip(Result<? extends T> result, Result<? extends U> result2) {
            return result.zip(result2, AnonymousClass1.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @adt
        public static <T, A, B, R> Result<R> zip(Result<? extends T> result, Result<? extends A> result2, Result<? extends B> result3, vu30 vu30Var) {
            return result2.zip(result3, vu30Var);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @adt
        public static <T, A, B> Result<mmr0> zip(Result<? extends T> result, Result<? extends A> result2, Result<? extends B> result3) {
            return result2.zip(result3);
        }
    }
}
