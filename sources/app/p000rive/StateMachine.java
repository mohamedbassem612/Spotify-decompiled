package app.p000rive;

import app.p000rive.core.ArtboardHandle;
import app.p000rive.core.CheckableAutoCloseable;
import app.p000rive.core.CloseOnce;
import app.p000rive.core.CommandQueue;
import app.p000rive.core.StateMachineHandle;
import app.p000rive.core.ViewModelInstanceHandle;
import app.p000rive.semantics.SemanticActionType;
import app.p000rive.semantics.SemanticTreeModel;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p.adt;
import p.d9n;
import p.dm61;
import p.eg;
import p.f4i1;
import p.gvg;
import p.hm5;
import p.lnm;
import p.os00;
import p.sqg0;
import p.u890;
import p.zno1;
import p.zob1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@Metadata(d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 d2\u00020\u0001:\u0002edB/\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u0010\u001a\u00020\rH\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0011\u0010\u000fJ\u001b\u0010\u0015\u001a\u00020\r2\n\u0010\u0012\u001a\u00060\u0004j\u0002`\u0005H\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u001a\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u0016H\u0000¢\u0006\u0004\b\u0018\u0010\u0019J-\u0010!\u001a\u00020\r2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u001b0\u001dH\u0000¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010#\u001a\u00020\rH\u0000¢\u0006\u0004\b\"\u0010\u000fJ\u0018\u0010(\u001a\u00020\r2\u0006\u0010%\u001a\u00020$ø\u0001\u0000¢\u0006\u0004\b&\u0010'J\u000f\u0010)\u001a\u00020\rH\u0007¢\u0006\u0004\b)\u0010\u000fJ'\u0010/\u001a\u00020\r2\u0006\u0010+\u001a\u00020*2\u0006\u0010-\u001a\u00020,2\u0006\u0010.\u001a\u00020,H\u0007¢\u0006\u0004\b/\u00100J\u001f\u00105\u001a\u00020\r2\u0006\u00102\u001a\u0002012\u0006\u00104\u001a\u000203H\u0007¢\u0006\u0004\b5\u00106J\u0017\u00107\u001a\u00020\r2\u0006\u00102\u001a\u000201H\u0007¢\u0006\u0004\b7\u00108J\u000f\u00109\u001a\u00020\rH\u0007¢\u0006\u0004\b9\u0010\u000fJ\u000f\u0010:\u001a\u00020\rH\u0007¢\u0006\u0004\b:\u0010\u000fJ\u000f\u0010;\u001a\u00020\rH\u0007¢\u0006\u0004\b;\u0010\u000fJ\u000f\u0010<\u001a\u00020\rH\u0007¢\u0006\u0004\b<\u0010\u000fJ\u000f\u0010=\u001a\u00020\rH\u0007¢\u0006\u0004\b=\u0010\u000fJ\u000f\u0010>\u001a\u00020\rH\u0007¢\u0006\u0004\b>\u0010\u000fJ\u000f\u0010?\u001a\u00020\rH\u0007¢\u0006\u0004\b?\u0010\u000fJ\u000f\u0010A\u001a\u00020\rH\u0000¢\u0006\u0004\b@\u0010\u000fR\u001d\u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0003\u0010B\u001a\u0004\bC\u0010DR\u0018\u0010\u0006\u001a\u00060\u0004j\u0002`\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010ER\u001a\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\b\u0010BR\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010F\u001a\u0004\bG\u0010HR\u0014\u0010J\u001a\u00020I8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010KR\u0014\u0010M\u001a\u00020L8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010NR \u0010Q\u001a\b\u0012\u0004\u0012\u00020P0O8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bQ\u0010R\u001a\u0004\bS\u0010TR&\u0010V\u001a\b\u0012\u0004\u0012\u00020U0O8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bV\u0010R\u0012\u0004\bX\u0010\u000f\u001a\u0004\bW\u0010TR&\u0010Y\u001a\b\u0012\u0004\u0012\u00020P0O8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bY\u0010R\u0012\u0004\b[\u0010\u000f\u001a\u0004\bZ\u0010TR\u0014\u0010^\u001a\u00020P8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\\\u0010]R\u001a\u0010c\u001a\u00020_8GX\u0087\u0004¢\u0006\f\u0012\u0004\bb\u0010\u000f\u001a\u0004\b`\u0010a\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006f"}, d2 = {"Lapp/rive/StateMachine;", "Lapp/rive/core/CheckableAutoCloseable;", "Lapp/rive/core/StateMachineHandle;", "stateMachineHandle", "Lapp/rive/core/CommandQueue;", "Lapp/rive/core/RiveWorker;", "riveWorker", "Lapp/rive/core/ArtboardHandle;", "artboardHandle", "", "name", "<init>", "(JLapp/rive/core/CommandQueue;JLjava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "Lp/rih1;", "checkOpen$kotlin_release", "()V", "checkOpen", "close", "worker", "requireOwnedBy$kotlin_release", "(Lapp/rive/core/CommandQueue;)V", "requireOwnedBy", "Lapp/rive/Artboard;", "artboard", "requireFromArtboard$kotlin_release", "(Lapp/rive/Artboard;)V", "requireFromArtboard", "Lapp/rive/ViewModelInstance;", "main", "", "globals", "bindViewModels$kotlin_release", "(Lapp/rive/ViewModelInstance;Ljava/util/Map;)V", "bindViewModels", "unsettle$kotlin_release", "unsettle", "Lp/jfv;", "deltaTime", "advance-LRDsOJo", "(J)V", "advance", "enableSemantics", "Lapp/rive/Fit;", "fit", "", "surfaceWidth", "surfaceHeight", "drainSemanticsDiff", "(Lapp/rive/Fit;FF)V", "", "nodeId", "Lapp/rive/semantics/SemanticActionType;", "action", "fireSemanticAction", "(ILapp/rive/semantics/SemanticActionType;)V", "requestSemanticFocus", "(I)V", "clearSemanticFocus", "focusNext", "focusPrevious", "clearFocus", "requestFocusState", "requestHasFocusNodes", "pollFocus", "clearSemanticFocusForLifecycleCleanup$kotlin_release", "clearSemanticFocusForLifecycleCleanup", "J", "getStateMachineHandle-a86gHUU", "()J", "Lapp/rive/core/CommandQueue;", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "Lapp/rive/StateMachine$Bindings;", "bindings", "Lapp/rive/StateMachine$Bindings;", "Lapp/rive/core/CloseOnce;", "closer", "Lapp/rive/core/CloseOnce;", "Lp/zob1;", "", "settled", "Lp/zob1;", "getSettled$kotlin_release", "()Lp/zob1;", "Lapp/rive/RiveFocusState;", "focusState", "getFocusState", "getFocusState$annotations", "hasFocusNodes", "getHasFocusNodes", "getHasFocusNodes$annotations", "getClosed", "()Z", "closed", "Lapp/rive/semantics/SemanticTreeModel;", "getSemanticTree", "()Lapp/rive/semantics/SemanticTreeModel;", "getSemanticTree$annotations", "semanticTree", "Companion", "Bindings", "kotlin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class StateMachine implements CheckableAutoCloseable {
    private final long artboardHandle;
    private final Bindings bindings;
    private final CloseOnce closer;
    private final zob1 focusState;
    private final zob1 hasFocusNodes;
    private final String name;
    private final CommandQueue riveWorker;
    private final zob1 settled;
    private final long stateMachineHandle;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0086@¢\u0006\u0004\b\t\u0010\nJ#\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lapp/rive/StateMachine$Companion;", "", "<init>", "()V", "Lapp/rive/Artboard;", "artboard", "", "stateMachineName", "Lapp/rive/StateMachine;", "create", "(Lapp/rive/Artboard;Ljava/lang/String;Lp/lnm;)Ljava/lang/Object;", "fromArtboard", "(Lapp/rive/Artboard;Ljava/lang/String;)Lapp/rive/StateMachine;", "kotlin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ Object create$default(Companion companion, Artboard artboard, String str, lnm lnmVar, int i, Object obj) {
            if ((i & 2) != 0) {
                str = null;
            }
            return companion.create(artboard, str, lnmVar);
        }

        public static /* synthetic */ StateMachine fromArtboard$default(Companion companion, Artboard artboard, String str, int i, Object obj) {
            if ((i & 2) != 0) {
                str = null;
            }
            return companion.fromArtboard(artboard, str);
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r13v0, types: [app.rive.Artboard, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r13v1 */
        /* JADX WARN: Type inference failed for: r13v10 */
        /* JADX WARN: Type inference failed for: r13v14, types: [java.lang.String] */
        /* JADX WARN: Type inference failed for: r13v2 */
        /* JADX WARN: Type inference failed for: r13v21 */
        /* JADX WARN: Type inference failed for: r13v22 */
        /* JADX WARN: Type inference failed for: r13v24 */
        /* JADX WARN: Type inference failed for: r13v25 */
        /* JADX WARN: Type inference failed for: r13v3, types: [java.lang.String] */
        /* JADX WARN: Type inference failed for: r13v6, types: [java.lang.String] */
        /* JADX WARN: Type inference failed for: r13v9 */
        /* JADX WARN: Type inference failed for: r15v1, types: [int] */
        /* JADX WARN: Type inference failed for: r15v10 */
        /* JADX WARN: Type inference failed for: r15v11 */
        /* JADX WARN: Type inference failed for: r15v12 */
        /* JADX WARN: Type inference failed for: r15v13, types: [app.rive.Artboard] */
        /* JADX WARN: Type inference failed for: r15v14 */
        /* JADX WARN: Type inference failed for: r15v19 */
        /* JADX WARN: Type inference failed for: r15v2 */
        /* JADX WARN: Type inference failed for: r15v20 */
        /* JADX WARN: Type inference failed for: r15v21 */
        /* JADX WARN: Type inference failed for: r15v22 */
        /* JADX WARN: Type inference failed for: r15v23 */
        /* JADX WARN: Type inference failed for: r15v24 */
        /* JADX WARN: Type inference failed for: r15v3 */
        /* JADX WARN: Type inference failed for: r15v4, types: [app.rive.Artboard] */
        /* JADX WARN: Type inference failed for: r15v5, types: [app.rive.Artboard] */
        /* JADX WARN: Type inference failed for: r15v7 */
        /* JADX WARN: Type inference failed for: r15v8 */
        public final Object create(Artboard artboard, String str, lnm<? super StateMachine> lnmVar) throws Exception {
            StateMachine$Companion$create$1 stateMachine$Companion$create$1;
            Exception exc;
            CancellationException cancellationException;
            ?? r15;
            ?? r13;
            ?? r16;
            ?? r14;
            ?? r17;
            String str2;
            ?? r18;
            String str3;
            long jM440unboximpl;
            if (lnmVar instanceof StateMachine$Companion$create$1) {
                stateMachine$Companion$create$1 = (StateMachine$Companion$create$1) lnmVar;
                int i = stateMachine$Companion$create$1.label;
                if ((i & os00.INVALID_ID) != 0) {
                    stateMachine$Companion$create$1.label = i - os00.INVALID_ID;
                } else {
                    stateMachine$Companion$create$1 = new StateMachine$Companion$create$1(this, lnmVar);
                }
            } else {
                stateMachine$Companion$create$1 = new StateMachine$Companion$create$1(this, lnmVar);
            }
            Object obj = stateMachine$Companion$create$1.result;
            ?? r19 = stateMachine$Companion$create$1.label;
            try {
                if (r19 == 0) {
                    hm5.M(obj);
                    String strConcat = str != null ? "with name ".concat(str) : "(default)";
                    RiveLog.INSTANCE.getLogger().d("Rive/StateMachine", new StateMachine$Companion$create$2(strConcat, artboard));
                    try {
                        artboard.checkOpen$kotlin_release();
                        d9n d9nVar = d9n.a;
                        if (str != null) {
                            CommandQueue riveWorker = artboard.getRiveWorker();
                            long artboardHandle = artboard.getArtboardHandle();
                            stateMachine$Companion$create$1.L$0 = artboard;
                            stateMachine$Companion$create$1.L$1 = str;
                            stateMachine$Companion$create$1.L$2 = strConcat;
                            stateMachine$Companion$create$1.label = 1;
                            Object objM218createStateMachineByNameConfirmedOHdLGcE = riveWorker.m218createStateMachineByNameConfirmedOHdLGcE(artboardHandle, str, stateMachine$Companion$create$1);
                            if (objM218createStateMachineByNameConfirmedOHdLGcE != d9nVar) {
                                r18 = artboard;
                                str3 = strConcat;
                                obj = objM218createStateMachineByNameConfirmedOHdLGcE;
                                jM440unboximpl = ((StateMachineHandle) obj).m440unboximpl();
                                artboard = str3;
                                r19 = r18;
                            }
                        } else {
                            CommandQueue riveWorker2 = artboard.getRiveWorker();
                            long artboardHandle2 = artboard.getArtboardHandle();
                            stateMachine$Companion$create$1.L$0 = artboard;
                            stateMachine$Companion$create$1.L$1 = str;
                            stateMachine$Companion$create$1.L$2 = strConcat;
                            stateMachine$Companion$create$1.label = 2;
                            Object objM216createDefaultStateMachineConfirmedItmKBmM = riveWorker2.m216createDefaultStateMachineConfirmedItmKBmM(artboardHandle2, stateMachine$Companion$create$1);
                            if (objM216createDefaultStateMachineConfirmedItmKBmM != d9nVar) {
                                r17 = artboard;
                                str2 = strConcat;
                                obj = objM216createDefaultStateMachineConfirmedItmKBmM;
                                jM440unboximpl = ((StateMachineHandle) obj).m440unboximpl();
                                artboard = str2;
                                r19 = r17;
                            }
                        }
                        return d9nVar;
                    } catch (CancellationException e) {
                        r16 = artboard;
                        r14 = strConcat;
                        cancellationException = e;
                        RiveLog.INSTANCE.getLogger().d("Rive/StateMachine", new StateMachine$Companion$create$4(r14, r16));
                        throw cancellationException;
                    } catch (Exception e2) {
                        r15 = artboard;
                        r13 = strConcat;
                        exc = e2;
                        RiveLog.INSTANCE.getLogger().e("Rive/StateMachine", exc, new StateMachine$Companion$create$5(r13, r15));
                        throw exc;
                    }
                }
                if (r19 == 1) {
                    String str4 = (String) stateMachine$Companion$create$1.L$2;
                    str = (String) stateMachine$Companion$create$1.L$1;
                    Artboard artboard2 = (Artboard) stateMachine$Companion$create$1.L$0;
                    hm5.M(obj);
                    str3 = str4;
                    r18 = artboard2;
                    jM440unboximpl = ((StateMachineHandle) obj).m440unboximpl();
                    artboard = str3;
                    r19 = r18;
                } else {
                    if (r19 != 2) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    String str5 = (String) stateMachine$Companion$create$1.L$2;
                    str = (String) stateMachine$Companion$create$1.L$1;
                    Artboard artboard3 = (Artboard) stateMachine$Companion$create$1.L$0;
                    hm5.M(obj);
                    str2 = str5;
                    r17 = artboard3;
                    jM440unboximpl = ((StateMachineHandle) obj).m440unboximpl();
                    artboard = str2;
                    r19 = r17;
                }
                String str6 = str;
                long j = jM440unboximpl;
                RiveLog.INSTANCE.getLogger().d("Rive/StateMachine", new StateMachine$Companion$create$3(j, artboard, r19));
                return new StateMachine(j, r19.getRiveWorker(), r19.getArtboardHandle(), str6, null);
            } catch (CancellationException e3) {
                cancellationException = e3;
                r14 = artboard;
                r16 = r19;
            } catch (Exception e4) {
                exc = e4;
                r13 = artboard;
                r15 = r19;
            }
        }

        @adt
        public final StateMachine fromArtboard(Artboard artboard, String stateMachineName) {
            artboard.checkOpen$kotlin_release();
            long jM217createStateMachineByNameItmKBmM = stateMachineName != null ? artboard.getRiveWorker().m217createStateMachineByNameItmKBmM(artboard.getArtboardHandle(), stateMachineName) : artboard.getRiveWorker().m215createDefaultStateMachinexY8vNfM(artboard.getArtboardHandle());
            RiveLog.INSTANCE.getLogger().d("Rive/StateMachine", new StateMachine$Companion$fromArtboard$1(jM217createStateMachineByNameItmKBmM, stateMachineName != null ? "with name ".concat(stateMachineName) : "(default)", artboard));
            return new StateMachine(jM217createStateMachineByNameItmKBmM, artboard.getRiveWorker(), artboard.getArtboardHandle(), stateMachineName, null);
        }

        private Companion() {
        }
    }

    private StateMachine(long j, CommandQueue commandQueue, long j2, String str) {
        this.stateMachineHandle = j;
        this.riveWorker = commandQueue;
        this.artboardHandle = j2;
        this.name = str;
        this.bindings = new Bindings(commandQueue, j, null);
        this.closer = new CloseOnce(StateMachineHandle.m439toStringimpl(j), new StateMachine$closer$1(this));
        this.settled = commandQueue.m289stateMachineSettledAkTCgDQ$kotlin_release(j);
        this.focusState = commandQueue.m239focusStateAkTCgDQ(j);
        this.hasFocusNodes = commandQueue.m257hasFocusNodesAkTCgDQ(j);
    }

    public static /* synthetic */ void getFocusState$annotations() {
    }

    public static /* synthetic */ void getHasFocusNodes$annotations() {
    }

    public static /* synthetic */ void getSemanticTree$annotations() {
    }

    /* JADX INFO: renamed from: advance-LRDsOJo, reason: not valid java name */
    public final void m100advanceLRDsOJo(long deltaTime) {
        this.closer.checkOpen();
        this.riveWorker.m202advanceStateMachineDDXDRQI(this.stateMachineHandle, deltaTime);
    }

    public final void bindViewModels$kotlin_release(ViewModelInstance main, Map<String, ViewModelInstance> globals) {
        checkOpen$kotlin_release();
        if (this.bindings.apply(main, globals)) {
            unsettle$kotlin_release();
        }
    }

    public final void checkOpen$kotlin_release() {
        this.closer.checkOpen();
    }

    public final void clearFocus() {
        this.closer.checkOpen();
        this.riveWorker.m207clearFocusAkTCgDQ(this.stateMachineHandle);
        unsettle$kotlin_release();
    }

    public final void clearSemanticFocus() {
        this.closer.checkOpen();
        this.riveWorker.m210clearSemanticFocusAkTCgDQ(this.stateMachineHandle);
        unsettle$kotlin_release();
    }

    public final void clearSemanticFocusForLifecycleCleanup$kotlin_release() {
        try {
            clearSemanticFocus();
        } catch (RiveResourceClosedException unused) {
        }
    }

    @Override // app.p000rive.core.CheckableAutoCloseable, java.lang.AutoCloseable
    public void close() {
        this.closer.close();
    }

    public final void drainSemanticsDiff(Fit fit, float surfaceWidth, float surfaceHeight) {
        this.closer.checkOpen();
        this.riveWorker.m231drainSemanticsDiffTORGcfM(this.stateMachineHandle, fit, surfaceWidth, surfaceHeight);
    }

    public final void enableSemantics() {
        this.closer.checkOpen();
        this.riveWorker.m234enableSemanticsAkTCgDQ(this.stateMachineHandle);
        unsettle$kotlin_release();
    }

    public final void fireSemanticAction(int nodeId, SemanticActionType action) {
        this.closer.checkOpen();
        this.riveWorker.m235fireSemanticActionDFYtxA(this.stateMachineHandle, nodeId, action);
        unsettle$kotlin_release();
    }

    public final void focusNext() {
        this.closer.checkOpen();
        this.riveWorker.m237focusNextAkTCgDQ(this.stateMachineHandle);
        unsettle$kotlin_release();
    }

    public final void focusPrevious() {
        this.closer.checkOpen();
        this.riveWorker.m238focusPreviousAkTCgDQ(this.stateMachineHandle);
        unsettle$kotlin_release();
    }

    @Override // app.p000rive.core.CheckableAutoCloseable
    public boolean getClosed() {
        return this.closer.getClosed();
    }

    public final zob1 getFocusState() {
        return this.focusState;
    }

    public final zob1 getHasFocusNodes() {
        return this.hasFocusNodes;
    }

    public final String getName() {
        return this.name;
    }

    public final SemanticTreeModel getSemanticTree() {
        this.closer.checkOpen();
        return this.riveWorker.m276semanticTreeAkTCgDQ(this.stateMachineHandle);
    }

    /* JADX INFO: renamed from: getSettled$kotlin_release, reason: from getter */
    public final zob1 getSettled() {
        return this.settled;
    }

    /* JADX INFO: renamed from: getStateMachineHandle-a86gHUU, reason: not valid java name and from getter */
    public final long getStateMachineHandle() {
        return this.stateMachineHandle;
    }

    public final void pollFocus() {
        this.closer.checkOpen();
        this.riveWorker.m265pollFocusAkTCgDQ(this.stateMachineHandle);
    }

    public final void requestFocusState() {
        this.closer.checkOpen();
        this.riveWorker.m271requestFocusStateAkTCgDQ(this.stateMachineHandle);
    }

    public final void requestHasFocusNodes() {
        this.closer.checkOpen();
        this.riveWorker.m272requestHasFocusNodesAkTCgDQ(this.stateMachineHandle);
    }

    public final void requestSemanticFocus(int nodeId) {
        this.closer.checkOpen();
        this.riveWorker.m273requestSemanticFocusOFH3VyA(this.stateMachineHandle, nodeId);
        unsettle$kotlin_release();
    }

    public final void requireFromArtboard$kotlin_release(Artboard artboard) {
        if (this.riveWorker != artboard.getRiveWorker() || !ArtboardHandle.m181equalsimpl0(this.artboardHandle, artboard.getArtboardHandle())) {
            throw new RiveIncompatibleResourceException(gvg.h("StateMachine ", StateMachineHandle.m439toStringimpl(this.stateMachineHandle), " was not created from Artboard ", ArtboardHandle.m183toStringimpl(artboard.getArtboardHandle())));
        }
    }

    public final void requireOwnedBy$kotlin_release(CommandQueue worker) {
        if (this.riveWorker != worker) {
            throw new RiveIncompatibleResourceException(f4i1.f("StateMachine ", StateMachineHandle.m439toStringimpl(this.stateMachineHandle), " is not owned by the required RiveWorker"));
        }
    }

    public final void unsettle$kotlin_release() {
        this.closer.checkOpen();
        this.riveWorker.m292unsettleStateMachineAkTCgDQ$kotlin_release(this.stateMachineHandle);
    }

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0012B\u0019\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J$\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u000e0\u0010R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0005\u001a\u00020\u0006X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\n\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0013"}, d2 = {"Lapp/rive/StateMachine$Bindings;", "", "riveWorker", "Lapp/rive/core/CommandQueue;", "Lapp/rive/core/RiveWorker;", "stateMachineHandle", "Lapp/rive/core/StateMachineHandle;", "(Lapp/rive/core/CommandQueue;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "applied", "Lapp/rive/StateMachine$Bindings$BindingSnapshot;", "J", "apply", "", "main", "Lapp/rive/ViewModelInstance;", "globals", "", "", "BindingSnapshot", "kotlin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Bindings {
        private BindingSnapshot applied;
        private final CommandQueue riveWorker;
        private final long stateMachineHandle;

        private Bindings(CommandQueue commandQueue, long j) {
            this.riveWorker = commandQueue;
            this.stateMachineHandle = j;
        }

        public final synchronized boolean apply(ViewModelInstance main, Map<String, ViewModelInstance> globals) {
            Map<String, ViewModelInstanceHandle> globals2;
            Map<String, ViewModelInstanceHandle> globals3;
            Set<String> setKeySet;
            try {
                Map mapU = sqg0.U(globals);
                if (main != null) {
                    main.checkOpen$kotlin_release();
                }
                if (main != null) {
                    main.requireOwnedBy$kotlin_release(this.riveWorker);
                }
                for (ViewModelInstance viewModelInstance : mapU.values()) {
                    viewModelInstance.checkOpen$kotlin_release();
                    viewModelInstance.requireOwnedBy$kotlin_release(this.riveWorker);
                }
                DefaultConstructorMarker defaultConstructorMarker = null;
                ViewModelInstanceHandle viewModelInstanceHandleM450boximpl = main != null ? ViewModelInstanceHandle.m450boximpl(main.getInstanceHandle()) : null;
                LinkedHashMap linkedHashMap = new LinkedHashMap(zno1.s(mapU.size()));
                for (Object obj : mapU.entrySet()) {
                    linkedHashMap.put(((Map.Entry) obj).getKey(), ViewModelInstanceHandle.m450boximpl(((ViewModelInstance) ((Map.Entry) obj).getValue()).getInstanceHandle()));
                }
                BindingSnapshot bindingSnapshot = new BindingSnapshot(viewModelInstanceHandleM450boximpl, linkedHashMap, defaultConstructorMarker);
                BindingSnapshot bindingSnapshot2 = this.applied;
                if (u890.j(bindingSnapshot2, bindingSnapshot)) {
                    return false;
                }
                RiveLog.INSTANCE.getLogger().d("Rive/StateMachine", new StateMachine$Bindings$apply$2(this, bindingSnapshot));
                if (!u890.j(bindingSnapshot2 != null ? bindingSnapshot2.m105getMainspIyslc() : null, bindingSnapshot.m105getMainspIyslc())) {
                    if (bindingSnapshot.m105getMainspIyslc() != null) {
                        this.riveWorker.m285setMainViewModelInstanceeiyHz8(this.stateMachineHandle, bindingSnapshot.m105getMainspIyslc().m456unboximpl());
                    } else if (bindingSnapshot2 != null) {
                        this.riveWorker.m209clearMainViewModelInstanceAkTCgDQ(this.stateMachineHandle);
                    }
                }
                if (bindingSnapshot2 != null && (globals3 = bindingSnapshot2.getGlobals()) != null && (setKeySet = globals3.keySet()) != null) {
                    Iterator it = dm61.v0(setKeySet, bindingSnapshot.getGlobals().keySet()).iterator();
                    while (it.hasNext()) {
                        this.riveWorker.m208clearGlobalViewModelInstanceOFH3VyA(this.stateMachineHandle, (String) it.next());
                    }
                }
                for (Map.Entry<String, ViewModelInstanceHandle> entry : bindingSnapshot.getGlobals().entrySet()) {
                    String key = entry.getKey();
                    long jM456unboximpl = entry.getValue().m456unboximpl();
                    ViewModelInstanceHandle viewModelInstanceHandle = (bindingSnapshot2 == null || (globals2 = bindingSnapshot2.getGlobals()) == null) ? null : globals2.get(key);
                    if (!(viewModelInstanceHandle == null ? false : ViewModelInstanceHandle.m453equalsimpl0(viewModelInstanceHandle.m456unboximpl(), jM456unboximpl))) {
                        this.riveWorker.m283setGlobalViewModelInstanceXIoLTdw(this.stateMachineHandle, key, jM456unboximpl);
                    }
                }
                this.riveWorker.m204bindAkTCgDQ(this.stateMachineHandle);
                this.applied = bindingSnapshot;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }

        @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0082\b\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\u0002\u0010\u0007J\u0016\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003ø\u0001\u0001ø\u0001\u0000¢\u0006\u0002\b\rJ\u0015\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003J3\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0001ø\u0001\u0000¢\u0006\u0002\b\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0006HÖ\u0001R\u001d\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0019\u0010\u0002\u001a\u0004\u0018\u00010\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0017"}, d2 = {"Lapp/rive/StateMachine$Bindings$BindingSnapshot;", "", "main", "Lapp/rive/core/ViewModelInstanceHandle;", "globals", "", "", "(Lapp/rive/core/ViewModelInstanceHandle;Ljava/util/Map;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getGlobals", "()Ljava/util/Map;", "getMain-spIyslc", "()Lapp/rive/core/ViewModelInstanceHandle;", "component1", "component1-spIyslc", "component2", "copy", "copy-3YpNlWA", "equals", "", "other", "hashCode", "", "toString", "kotlin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class BindingSnapshot {
            private final Map<String, ViewModelInstanceHandle> globals;
            private final ViewModelInstanceHandle main;

            private BindingSnapshot(ViewModelInstanceHandle viewModelInstanceHandle, Map<String, ViewModelInstanceHandle> map) {
                this.main = viewModelInstanceHandle;
                this.globals = map;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX INFO: renamed from: copy-3YpNlWA$default, reason: not valid java name */
            public static /* synthetic */ BindingSnapshot m102copy3YpNlWA$default(BindingSnapshot bindingSnapshot, ViewModelInstanceHandle viewModelInstanceHandle, Map map, int i, Object obj) {
                if ((i & 1) != 0) {
                    viewModelInstanceHandle = bindingSnapshot.main;
                }
                if ((i & 2) != 0) {
                    map = bindingSnapshot.globals;
                }
                return bindingSnapshot.m104copy3YpNlWA(viewModelInstanceHandle, map);
            }

            /* JADX INFO: renamed from: component1-spIyslc, reason: not valid java name and from getter */
            public final ViewModelInstanceHandle getMain() {
                return this.main;
            }

            public final Map<String, ViewModelInstanceHandle> component2() {
                return this.globals;
            }

            /* JADX INFO: renamed from: copy-3YpNlWA, reason: not valid java name */
            public final BindingSnapshot m104copy3YpNlWA(ViewModelInstanceHandle main, Map<String, ViewModelInstanceHandle> globals) {
                return new BindingSnapshot(main, globals, null);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof BindingSnapshot)) {
                    return false;
                }
                BindingSnapshot bindingSnapshot = (BindingSnapshot) other;
                return u890.j(this.main, bindingSnapshot.main) && u890.j(this.globals, bindingSnapshot.globals);
            }

            public final Map<String, ViewModelInstanceHandle> getGlobals() {
                return this.globals;
            }

            /* JADX INFO: renamed from: getMain-spIyslc, reason: not valid java name */
            public final ViewModelInstanceHandle m105getMainspIyslc() {
                return this.main;
            }

            public int hashCode() {
                ViewModelInstanceHandle viewModelInstanceHandle = this.main;
                return this.globals.hashCode() + ((viewModelInstanceHandle == null ? 0 : ViewModelInstanceHandle.m454hashCodeimpl(viewModelInstanceHandle.m456unboximpl())) * 31);
            }

            public String toString() {
                return "BindingSnapshot(main=" + this.main + ", globals=" + this.globals + ")";
            }

            public /* synthetic */ BindingSnapshot(ViewModelInstanceHandle viewModelInstanceHandle, Map map, DefaultConstructorMarker defaultConstructorMarker) {
                this(viewModelInstanceHandle, map);
            }
        }

        public /* synthetic */ Bindings(CommandQueue commandQueue, long j, DefaultConstructorMarker defaultConstructorMarker) {
            this(commandQueue, j);
        }
    }

    public /* synthetic */ StateMachine(long j, CommandQueue commandQueue, long j2, String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, commandQueue, j2, str);
    }
}
