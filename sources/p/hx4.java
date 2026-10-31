package p;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Configuration;
import android.graphics.Point;
import android.graphics.Rect;
import android.inputmethodservice.InputMethodService;
import android.os.Build;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import androidx.car.app.navigation.model.Maneuver;
import androidx.work.impl.WorkDatabase;
import com.ravelin.core.repository.broadcastsdb.BroadcastsDatabase_Impl;
import com.ravelin.core.repository.db.AppDatabase_Impl;
import com.spotify.mobius.functions.Consumer;
import java.util.Collections;
import java.util.concurrent.CancellationException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class hx4 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ hx4(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public final Object invoke() {
        ContextWrapper contextWrapper;
        vrl1 prl1Var;
        atl1 atl1Var;
        b8f1 state;
        byte b = this.a;
        byte b2 = 1;
        float fA = 0.0f;
        rih1 rih1Var = rih1.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                smo1.p(((jx4) obj).c, (CancellationException) null);
                return rih1Var;
            case 1:
                ha71.x((t05) obj);
                return rih1Var;
            case 2:
                return ((g3e1) obj).R();
            case 3:
                return rih1Var;
            case 4:
                return new f7n1((AppDatabase_Impl) obj);
            case 5:
                return new d7((Object[]) obj, b2);
            case 6:
                return (af5) obj;
            case 7:
                return dxa.b((dxa) obj);
            case 8:
                h6b h6bVar = (h6b) obj;
                h6bVar.T0.invoke(h6bVar);
                return rih1Var;
            case 9:
                return Float.valueOf(((iyb) obj).a.e.V());
            case 10:
                return (n511) obj;
            case 11:
                return new wug((BroadcastsDatabase_Impl) obj);
            case 12:
                cqc cqcVar = (cqc) obj;
                do41 do41Var = cqcVar.Q0;
                if (do41Var == null) {
                    do41Var = new do41();
                    cqcVar.Q0 = do41Var;
                }
                if (do41Var.b == null) {
                    yd50 yd50VarY = oap1.y(cqcVar);
                    do41Var.d();
                    do41Var.b = yd50VarY;
                }
                return do41Var;
            case 13:
                awl1 awl1Var = (awl1) obj;
                WorkDatabase workDatabase = awl1Var.c;
                workDatabase.r(new an31(new ny2((Object) workDatabase, (Object) awl1Var, (byte) 26), (byte) 0));
                om41.b(awl1Var.b, workDatabase, awl1Var.e);
                return rih1Var;
            case 14:
                wdp0 wdp0Var = (wdp0) ((kvg) obj).b.get("fingerprint emitter");
                if (wdp0Var != null) {
                    wdp0Var.d = true;
                }
                return rih1Var;
            case 15:
                return ((Iterable) obj).iterator();
            case 16:
                Function0 function0 = ((ich) obj).l1;
                if (function0 != null) {
                    function0.invoke();
                }
                return Boolean.TRUE;
            case 17:
                return Collections.singletonList((mmr0) obj);
            case 18:
                boolean zB = yr80.b(0L, 0L);
                View view = ((qzj) obj).a;
                if (!zB) {
                    return new jdt(0L, z1a1.b(view.getContext()).t(o0c.R(0L)));
                }
                Context context = view.getContext();
                Context baseContext = context;
                while (true) {
                    if (baseContext instanceof ContextWrapper) {
                        if (!(baseContext instanceof Activity) && !(baseContext instanceof InputMethodService) && !(baseContext instanceof Application)) {
                            ContextWrapper contextWrapper2 = (ContextWrapper) baseContext;
                            if (contextWrapper2.getBaseContext() != null) {
                                baseContext = contextWrapper2.getBaseContext();
                            }
                        }
                    }
                    baseContext = null;
                }
                if (baseContext == null) {
                    Configuration configuration = context.getResources().getConfiguration();
                    yat yatVarB = z1a1.b(context);
                    long jC = jhc1.c(configuration.screenWidthDp, configuration.screenHeightDp);
                    return new jdt(o0c.P(yatVarB.k1(jC)), jC);
                }
                btl1.a.getClass();
                ctl1 ctl1VarH = gtv0.h();
                ContextWrapper contextWrapper3 = (ContextWrapper) baseContext;
                int i = Build.VERSION.SDK_INT;
                if (i >= 30) {
                    atl1Var = hbm.c(contextWrapper3);
                } else {
                    Context baseContext2 = contextWrapper3;
                    while (true) {
                        if (!(baseContext2 instanceof ContextWrapper)) {
                            eg.n("Context ", contextWrapper3, " is not a UiContext");
                            contextWrapper = null;
                        } else if (baseContext2 instanceof Activity) {
                            contextWrapper = (ContextWrapper) baseContext2;
                        } else if (baseContext2 instanceof InputMethodService) {
                            contextWrapper = (ContextWrapper) baseContext2;
                        } else {
                            contextWrapper = (ContextWrapper) baseContext2;
                            if (contextWrapper.getBaseContext() != null) {
                                baseContext2 = contextWrapper.getBaseContext();
                            }
                        }
                    }
                    if (contextWrapper instanceof Activity) {
                        atl1Var = ctl1VarH.a((Activity) contextWrapper3);
                    } else {
                        if (!(contextWrapper instanceof InputMethodService)) {
                            k220.g(contextWrapper3, " is not a UiContext");
                            return null;
                        }
                        Display defaultDisplay = ((WindowManager) contextWrapper3.getSystemService("window")).getDefaultDisplay();
                        Point point = new Point();
                        gm50.v(defaultDisplay, point);
                        Rect rect = new Rect(0, 0, point.x, point.y);
                        if (i >= 36) {
                            prl1Var = new url1();
                        } else if (i >= 35) {
                            prl1Var = new trl1();
                        } else if (i >= 34) {
                            prl1Var = new srl1();
                        } else if (i >= 31) {
                            prl1Var = new rrl1();
                        } else if (i >= 30) {
                            prl1Var = new qrl1();
                        } else {
                            prl1Var = i >= 29 ? new prl1() : new nrl1();
                        }
                        atl1Var = new atl1(rect, prl1Var.b());
                    }
                }
                long jWidth = (((long) atl1Var.a().width()) << 32) | (((long) atl1Var.a().height()) & 4294967295L);
                return new jdt(jWidth, z1a1.b(baseContext).t(o0c.R(jWidth)));
            case 19:
                return ((ic9) obj).b(":memory:");
            case 20:
                return ((r1c0) obj).d();
            case 21:
                return new r6e1((qqq0) obj, 0.0f);
            case 22:
                ((y8n) obj).Z = null;
                return rih1Var;
            case 23:
                return ((ooo) obj).a();
            case 24:
                ges gesVar = (ges) obj;
                o5e0 o5e0Var = gesVar.Z0;
                final byte b3 = 6;
                Consumer consumer = new Consumer() { // from class: p.aes
                    public final void accept(Object obj2) {
                        switch (b3) {
                            case 0:
                                break;
                            case 1:
                                break;
                            case 2:
                                break;
                            case 3:
                                break;
                            case 4:
                                break;
                            case 5:
                                break;
                            case 6:
                                break;
                            case 7:
                                break;
                            case 8:
                                break;
                            case 9:
                                break;
                            case 10:
                                break;
                            default:
                                break;
                        }
                    }
                };
                final byte b4 = 7;
                Consumer consumer2 = new Consumer() { // from class: p.aes
                    public final void accept(Object obj2) {
                        switch (b4) {
                            case 0:
                                break;
                            case 1:
                                break;
                            case 2:
                                break;
                            case 3:
                                break;
                            case 4:
                                break;
                            case 5:
                                break;
                            case 6:
                                break;
                            case 7:
                                break;
                            case 8:
                                break;
                            case 9:
                                break;
                            case 10:
                                break;
                            default:
                                break;
                        }
                    }
                };
                final byte b5 = 8;
                Consumer consumer3 = new Consumer() { // from class: p.aes
                    public final void accept(Object obj2) {
                        switch (b5) {
                            case 0:
                                break;
                            case 1:
                                break;
                            case 2:
                                break;
                            case 3:
                                break;
                            case 4:
                                break;
                            case 5:
                                break;
                            case 6:
                                break;
                            case 7:
                                break;
                            case 8:
                                break;
                            case 9:
                                break;
                            case 10:
                                break;
                            default:
                                break;
                        }
                    }
                };
                final byte b6 = 9;
                Consumer consumer4 = new Consumer() { // from class: p.aes
                    public final void accept(Object obj2) {
                        switch (b6) {
                            case 0:
                                break;
                            case 1:
                                break;
                            case 2:
                                break;
                            case 3:
                                break;
                            case 4:
                                break;
                            case 5:
                                break;
                            case 6:
                                break;
                            case 7:
                                break;
                            case 8:
                                break;
                            case 9:
                                break;
                            case 10:
                                break;
                            default:
                                break;
                        }
                    }
                };
                final byte b7 = 10;
                final byte b8 = 11;
                o5e0Var.i(consumer, consumer2, consumer3, consumer4, new Consumer() { // from class: p.aes
                    public final void accept(Object obj2) {
                        switch (b7) {
                            case 0:
                                break;
                            case 1:
                                break;
                            case 2:
                                break;
                            case 3:
                                break;
                            case 4:
                                break;
                            case 5:
                                break;
                            case 6:
                                break;
                            case 7:
                                break;
                            case 8:
                                break;
                            case 9:
                                break;
                            case 10:
                                break;
                            default:
                                break;
                        }
                    }
                }, new ces(gesVar, (byte) 2), new Consumer() { // from class: p.aes
                    public final void accept(Object obj2) {
                        switch (b8) {
                            case 0:
                                break;
                            case 1:
                                break;
                            case 2:
                                break;
                            case 3:
                                break;
                            case 4:
                                break;
                            case 5:
                                break;
                            case 6:
                                break;
                            case 7:
                                break;
                            case 8:
                                break;
                            case 9:
                                break;
                            case 10:
                                break;
                            default:
                                break;
                        }
                    }
                }, new ces(gesVar, (byte) 3));
                return rih1Var;
            case 25:
                ((r3e1) obj).close();
                return rih1Var;
            case 26:
                a8f1 a8f1Var = ((szg1) obj).o;
                if (a8f1Var != null && (state = a8f1Var.getState()) != null) {
                    fA = state.a();
                }
                return Float.valueOf(fA);
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                wat watVarA = ((n8v) obj).a();
                pxg1 pxg1Var = g8v.a;
                return Float.valueOf(watVarA.X0(400.0f));
            default:
                h46 h46Var = ((b5x) obj).i;
                if (h46Var != null) {
                    return h46Var;
                }
                u890.C("emojiPickerItems");
                throw null;
        }
    }
}
