package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Supplier;
import io.reactivex.rxjava3.internal.subscriptions.EmptySubscription;
import io.reactivex.rxjava3.internal.subscriptions.ScalarSubscription;
import java.util.Objects;
import p.gnc1;
import p.moy0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public abstract class FlowableScalarXMap {
    public static Flowable a(Object obj, Function function) {
        return new ScalarXMapFlowable(obj, function);
    }

    public static boolean b(moy0 moy0Var, gnc1 gnc1Var, Function function) {
        EmptySubscription emptySubscription = EmptySubscription.a;
        if (!(moy0Var instanceof Supplier)) {
            return false;
        }
        try {
            Object obj = ((Supplier) moy0Var).get();
            if (obj == null) {
                gnc1Var.onSubscribe(emptySubscription);
                gnc1Var.onComplete();
                return true;
            }
            try {
                Object objApply = function.apply(obj);
                Objects.requireNonNull(objApply, "The mapper returned a null Publisher");
                moy0 moy0Var2 = (moy0) objApply;
                if (!(moy0Var2 instanceof Supplier)) {
                    moy0Var2.subscribe(gnc1Var);
                    return true;
                }
                try {
                    Object obj2 = ((Supplier) moy0Var2).get();
                    if (obj2 != null) {
                        gnc1Var.onSubscribe(new ScalarSubscription(obj2, gnc1Var));
                        return true;
                    }
                    gnc1Var.onSubscribe(emptySubscription);
                    gnc1Var.onComplete();
                    return true;
                } catch (Throwable th) {
                    Exceptions.a(th);
                    gnc1Var.onSubscribe(emptySubscription);
                    gnc1Var.onError(th);
                    return true;
                }
            } catch (Throwable th2) {
                Exceptions.a(th2);
                gnc1Var.onSubscribe(emptySubscription);
                gnc1Var.onError(th2);
                return true;
            }
        } catch (Throwable th3) {
            Exceptions.a(th3);
            gnc1Var.onSubscribe(emptySubscription);
            gnc1Var.onError(th3);
            return true;
        }
    }
}
