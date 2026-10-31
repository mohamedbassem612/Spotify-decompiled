package p;

import android.content.Intent;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.automix.proto.TransitionOuterClass$Overlap;
import com.spotify.base.java.logging.Logger;
import com.spotify.checkout.spotifycheckout.SpotifyCheckoutActivity;
import com.spotify.encoremobile.component.buttons.EncoreButton;
import com.spotify.player.esperanto.proto.EsResponseWithReasons;
import com.spotify.stream_reporting_esperanto.proto.StreamStartResponseOuterClass;
import com.spotify.tap.go.socket.SocketIo;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableEmitter;
import io.reactivex.rxjava3.core.ObservableOnSubscribe;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Predicate;
import io.reactivex.rxjava3.internal.operators.completable.CompletableEmpty;
import io.reactivex.rxjava3.internal.operators.completable.CompletableFromAction;
import io.reactivex.rxjava3.observables.GroupedObservable;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class q881 implements Function, ObservableOnSubscribe, k1q0, qhh0, qiw, BiFunction, Predicate, jrn0, pe5 {
    public final /* synthetic */ byte a;
    public Object b;

    public q881(float f, float f2, oe5 oe5Var) {
        this.a = (byte) 28;
        int iB = oe5Var.b();
        gr20[] gr20VarArr = new gr20[iB];
        for (int i = 0; i < iB; i++) {
            gr20VarArr[i] = new gr20(f, f2, oe5Var.a(i));
        }
        this.b = gr20VarArr;
    }

    public static q881 d(m8b0 m8b0Var) {
        if (m8b0Var.a() == 32) {
            return new q881((Object) m8b0Var, (byte) 16);
        }
        hhg1.n(f4i1.c(m8b0Var.a(), "Message must be of type SUBSCRIBE(32), but was "));
        return null;
    }

    public Object apply(Object obj) {
        int i;
        switch (this.a) {
            case 1:
                return Observable.create(new ke71((x981) this.b, (l101) obj, (byte) 11));
            case 3:
                hv81 hv81Var = (hv81) this.b;
                return hv81.h(hv81Var, hv81Var.b.j((List) obj), (LinkedHashSet) null, 13);
            case 5:
                EsResponseWithReasons.ResponseWithReasons responseWithReasons = (EsResponseWithReasons.ResponseWithReasons) obj;
                ((bo91) this.b).getClass();
                if (zn91.a[responseWithReasons.n().ordinal()] == 1) {
                    return CompletableEmpty.a;
                }
                final String strM = l1d.m("Play failed, ", responseWithReasons.o());
                return Completable.j(new RuntimeException(strM) { // from class: com.spotify.smartshuffle.playerimpl.SmartShufflePlayerImpl$PlayException
                    public final String a;

                    {
                        this.a = strM;
                    }

                    @Override // java.lang.Throwable
                    public final String getMessage() {
                        return this.a;
                    }
                });
            case 15:
                StreamStartResponseOuterClass.StreamStartResponse streamStartResponse = (StreamStartResponseOuterClass.StreamStartResponse) obj;
                wec1 wec1Var = (wec1) this.b;
                wec1Var.P0 = streamStartResponse.o();
                wec1Var.V(streamStartResponse.n(), 1);
                return CompletableEmpty.a;
            case 17:
                v491 v491Var = (v491) this.b;
                return v491.h(v491Var, v491Var.a.j((List) obj), null, 6);
            default:
                String str = (String) obj;
                jcd1 jcd1Var = (jcd1) this.b;
                int iC = l1d.C(3);
                if (iC == 0) {
                    i = 2;
                } else if (iC == 1) {
                    i = 4;
                } else {
                    if (iC != 2) {
                        eg.o();
                        return null;
                    }
                    i = 3;
                }
                return j2h1.D(jcd1Var.g, new zi3(jcd1Var, str, i, (lnm) null, (byte) 17)).g(new dkb1(jcd1Var, str, (byte) 4));
        }
    }

    /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.RegisterArg.sameRegAndSVar(jadx.core.dex.instructions.args.InsnArg)" because "resultArg" is null
        	at jadx.core.dex.visitors.MoveInlineVisitor.processMove(MoveInlineVisitor.java:52)
        	at jadx.core.dex.visitors.MoveInlineVisitor.moveInline(MoveInlineVisitor.java:41)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:43)
        */
    public java.util.List b(
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r26v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:215)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:150)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:415)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:299)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
        */
    /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.RegisterArg.sameRegAndSVar(jadx.core.dex.instructions.args.InsnArg)" because "resultArg" is null
        	at jadx.core.dex.visitors.MoveInlineVisitor.processMove(MoveInlineVisitor.java:52)
        	at jadx.core.dex.visitors.MoveInlineVisitor.moveInline(MoveInlineVisitor.java:41)
        */

    public ze70 c() {
        return ((t700) this.b).a();
    }

    public int e() {
        return ((m8b0) this.b).b(1);
    }

    public String f() {
        return ((m8b0) this.b).d(3);
    }

    public uq20 get(int i) {
        return ((gr20[]) this.b)[i];
    }

    public irn0 l(Intent intent, th61 th61Var) {
        xye1 xye1Var = (xye1) ((wf2) this.b).b;
        Set set = s4b1.f;
        blc0 blc0Var = uic.x(intent.getDataString()).c;
        if (blc0Var == blc0.Ki) {
            xye1Var.a(2131960361, new Object[0]);
        } else if (blc0Var == blc0.Sh) {
            xye1Var.a(2131963399, new Object[0]);
        }
        return crn0.a;
    }

    public void subscribe(ObservableEmitter observableEmitter) {
        f6a1 f6a1Var = (f6a1) this.b;
        observableEmitter.setCancellable(new ci0(f6a1Var, (byte) 8));
        while (true) {
            try {
                Logger.g("Go: Start reading commands", new Object[0]);
                hkt0 hkt0VarC = f6a1Var.c();
                if (!observableEmitter.isDisposed()) {
                    observableEmitter.onNext(hkt0VarC);
                }
            } catch (SocketIo.CommandParseException e) {
                Logger.e(e, "Go: Command error", new Object[0]);
            } catch (SocketIo.CommandReadException e2) {
                Logger.h(e2, "Go: Session ended (no bytes from stream)", new Object[0]);
                if (observableEmitter.isDisposed()) {
                    return;
                }
                observableEmitter.onError(e2);
                return;
            } catch (SocketIo.ConnectionException e3) {
                Logger.h(e3, "Go: Session IO error", new Object[0]);
                if (observableEmitter.isDisposed()) {
                    return;
                }
                observableEmitter.onError(e3);
                return;
            } catch (Exception e4) {
                Logger.e(e4, "Go: Unknown exception", new Object[0]);
                if (observableEmitter.isDisposed()) {
                    return;
                }
                observableEmitter.onError(e4);
                return;
            }
        }
    }

    public boolean test(Object obj) {
        String str = (String) obj;
        mmr0 mmr0Var = (mmr0) ((GroupedObservable) this.b).a;
        return u890.j(mmr0Var != null ? (String) mmr0Var.a : null, str);
    }

    public void v(Object obj) {
        switch (this.a) {
            case 13:
                ((v9c1) this.b).a((kas0) obj);
                break;
            case 14:
                c4c1 c4c1Var = (c4c1) ((he7) this.b).d;
                int iOrdinal = ((jix0) obj).ordinal();
                if (iOrdinal == 0) {
                    c4c1Var.a(f5c1.a);
                } else if (iOrdinal != 1) {
                    eg.o();
                } else {
                    c4c1Var.a(g5c1.a);
                }
                break;
            case 23:
                gku gkuVar = (khm0) obj;
                keg1 keg1Var = (keg1) this.b;
                if (u890.j(gkuVar, g860.a)) {
                    keg1Var.y();
                } else if (!(gkuVar instanceof gku)) {
                    eg.o();
                } else {
                    keg1Var.x(gkuVar);
                }
                break;
            default:
                ouj1 ouj1Var = (ouj1) obj;
                if (ouj1Var.a.length() > 0) {
                    ((cej1) this.b).f.m(ouj1Var.d);
                }
                break;
        }
    }

    public hsl1 x(View view, hsl1 hsl1Var) {
        nk80 nk80VarI = hsl1Var.a.i(655);
        ai0 ai0Var = ((SpotifyCheckoutActivity) this.b).b1;
        if (ai0Var == null) {
            u890.C("viewBinding");
            throw null;
        }
        ((CoordinatorLayout) ai0Var.a).setPadding(nk80VarI.a, nk80VarI.b, nk80VarI.c, nk80VarI.d);
        return hsl1.b;
    }

    public q881(byte b) {
        this.a = b;
        switch (b) {
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                this.b = new rku();
                break;
        }
    }

    public q881(RecyclerView recyclerView, RecyclerView recyclerView2) {
        this.a = (byte) 22;
        this.b = recyclerView2;
    }

    public q881(aai0 aai0Var, p370 p370Var, uic uicVar) {
        this.a = (byte) 10;
        this.b = aai0Var;
    }

    public q881(ConstraintLayout constraintLayout, RecyclerView recyclerView, EncoreButton encoreButton) {
        this.a = (byte) 6;
        this.b = encoreButton;
    }

    public q881(t4h1 t4h1Var) {
        this.a = (byte) 24;
        this.b = t4h1Var.q;
    }

    public /* synthetic */ q881(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public Object apply(Object obj, Object obj2) {
        return new CompletableFromAction(new wf0((im0) this.b, (String) obj, (fvf1) obj2, (byte) 24));
    }
}
