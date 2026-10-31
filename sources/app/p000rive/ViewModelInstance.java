package app.p000rive;

import app.p000rive.core.ArtboardHandle;
import app.p000rive.core.CheckableAutoCloseable;
import app.p000rive.core.CloseOnce;
import app.p000rive.core.CommandQueue;
import app.p000rive.core.FileHandle;
import app.p000rive.core.FontHandle;
import app.p000rive.core.ImageHandle;
import app.p000rive.core.ViewModelInstanceHandle;
import app.p000rive.runtime.kotlin.core.ViewModel;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p.a8d1;
import p.adt;
import p.at71;
import p.d9n;
import p.dt71;
import p.eg;
import p.f4i1;
import p.faa0;
import p.fn31;
import p.h4p1;
import p.hab0;
import p.hm5;
import p.l1d;
import p.lnm;
import p.lyc;
import p.m441;
import p.mgo1;
import p.mr20;
import p.o4p1;
import p.os00;
import p.q8r;
import p.rih1;
import p.sen0;
import p.ssw0;
import p.tv30;
import p.vu30;
import p.xab1;
import p.xu30;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@Metadata(d1 = {"\u0000¦\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0007\u0018\u0000 |2\u00020\u0001:\u0001|B%\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\u000e\u0010\rJ\u001b\u0010\u0013\u001a\u00020\u000b2\n\u0010\u0010\u001a\u00060\u0004j\u0002`\u0005H\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0015\u001a\u00020\u0014H\u0086@¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0014H\u0086@¢\u0006\u0004\b\u0017\u0010\u0016J\u001b\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00192\u0006\u0010\u0018\u001a\u00020\u0014¢\u0006\u0004\b\u001b\u0010\u001cJ\u001b\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00140\u00192\u0006\u0010\u0018\u001a\u00020\u0014¢\u0006\u0004\b\u001d\u0010\u001cJ\u001b\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00192\u0006\u0010\u0018\u001a\u00020\u0014¢\u0006\u0004\b\u001f\u0010\u001cJ\u001b\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00140\u00192\u0006\u0010\u0018\u001a\u00020\u0014¢\u0006\u0004\b \u0010\u001cJ\u001b\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0\u00192\u0006\u0010\u0018\u001a\u00020\u0014¢\u0006\u0004\b\"\u0010\u001cJ\u001b\u0010#\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00192\u0006\u0010\u0018\u001a\u00020\u0014¢\u0006\u0004\b#\u0010\u001cJ\u001d\u0010%\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u00142\u0006\u0010$\u001a\u00020\u001a¢\u0006\u0004\b%\u0010&J\u001d\u0010'\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u00142\u0006\u0010$\u001a\u00020\u0014¢\u0006\u0004\b'\u0010(J\u001d\u0010)\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u00142\u0006\u0010$\u001a\u00020\u001e¢\u0006\u0004\b)\u0010*J\u001d\u0010+\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u00142\u0006\u0010$\u001a\u00020\u0014¢\u0006\u0004\b+\u0010(J\u001f\u0010,\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u00142\b\b\u0001\u0010$\u001a\u00020!¢\u0006\u0004\b,\u0010-J\u0015\u0010.\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u0014¢\u0006\u0004\b.\u0010/J\u001f\u00102\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u00142\b\u00101\u001a\u0004\u0018\u000100¢\u0006\u0004\b2\u00103J\u001f\u00106\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u00142\b\u00105\u001a\u0004\u0018\u000104¢\u0006\u0004\b6\u00107J\u001f\u0010:\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u00142\b\u00109\u001a\u0004\u0018\u000108¢\u0006\u0004\b:\u0010;J\u001d\u0010=\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u00142\u0006\u0010<\u001a\u00020\u0000¢\u0006\u0004\b=\u0010>J\u0018\u0010?\u001a\u00020!2\u0006\u0010\u0018\u001a\u00020\u0014H\u0086@¢\u0006\u0004\b?\u0010@J%\u0010C\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u00142\u0006\u0010A\u001a\u00020!2\u0006\u0010B\u001a\u00020\u0000¢\u0006\u0004\bC\u0010DJ\u001d\u0010E\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u00142\u0006\u0010B\u001a\u00020\u0000¢\u0006\u0004\bE\u0010>J\u001d\u0010F\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u00142\u0006\u0010A\u001a\u00020!¢\u0006\u0004\bF\u0010-J\u001d\u0010G\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u00142\u0006\u0010B\u001a\u00020\u0000¢\u0006\u0004\bG\u0010>J%\u0010J\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u00142\u0006\u0010H\u001a\u00020!2\u0006\u0010I\u001a\u00020!¢\u0006\u0004\bJ\u0010KJ%\u0010M\u001a\b\u0012\u0004\u0012\u00028\u00000\u0019\"\u0004\b\u0000\u0010L*\b\u0012\u0004\u0012\u00028\u00000\u0019H\u0002¢\u0006\u0004\bM\u0010NJ\u008d\u0001\u0010[\u001a\b\u0012\u0004\u0012\u00028\u00000\u0019\"\u0004\b\u0000\u0010L2\u0006\u0010\u0018\u001a\u00020\u00142\u0018\u0010P\u001a\u0014\u0012\u0004\u0012\u00020\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00190O2(\u0010T\u001a$\b\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000R\u0012\u0006\u0012\u0004\u0018\u00010S0Q2\u001c\u0010X\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00028\u00000Vj\b\u0012\u0004\u0012\u00028\u0000`W0U2\u0006\u0010Z\u001a\u00020YH\u0002¢\u0006\u0004\b[\u0010\\JE\u0010^\u001a\u00020\u000b\"\u0004\b\u0000\u0010L2\u0006\u0010\u0018\u001a\u00020\u00142\u0006\u0010$\u001a\u00028\u00002\u001e\u0010]\u001a\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000b0QH\u0002¢\u0006\u0004\b^\u0010_R\u001d\u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0003\u0010`\u001a\u0004\ba\u0010bR\u0018\u0010\u0006\u001a\u00060\u0004j\u0002`\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010cR\u001a\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\b\u0010`R\u001a\u0010e\u001a\b\u0012\u0004\u0012\u00020\u000b0d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\be\u0010fR\u0014\u0010h\u001a\u00020g8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bh\u0010iR\u0014\u0010k\u001a\u00020j8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bk\u0010lR\u001a\u0010m\u001a\b\u0012\u0004\u0012\u00020\u000b0d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bm\u0010fR \u0010n\u001a\b\u0012\u0004\u0012\u00020\u000b0U8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bn\u0010o\u001a\u0004\bp\u0010qR&\u0010r\u001a\u0014\u0012\u0004\u0012\u00020\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u00190O8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\br\u0010sR&\u0010t\u001a\u0014\u0012\u0004\u0012\u00020\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00190O8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bt\u0010sR&\u0010u\u001a\u0014\u0012\u0004\u0012\u00020\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0\u00190O8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bu\u0010sR&\u0010v\u001a\u0014\u0012\u0004\u0012\u00020\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00190O8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bv\u0010sR&\u0010w\u001a\u0014\u0012\u0004\u0012\u00020\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020!0\u00190O8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bw\u0010sR&\u0010x\u001a\u0014\u0012\u0004\u0012\u00020\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00190O8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bx\u0010sR\u0014\u0010{\u001a\u00020\u001e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\by\u0010z\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006}"}, d2 = {"Lapp/rive/ViewModelInstance;", "Lapp/rive/core/CheckableAutoCloseable;", "Lapp/rive/core/ViewModelInstanceHandle;", "instanceHandle", "Lapp/rive/core/CommandQueue;", "Lapp/rive/core/RiveWorker;", "riveWorker", "Lapp/rive/core/FileHandle;", "fileHandle", "<init>", "(JLapp/rive/core/CommandQueue;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "Lp/rih1;", "close", "()V", "checkOpen$kotlin_release", "checkOpen", "worker", "requireOwnedBy$kotlin_release", "(Lapp/rive/core/CommandQueue;)V", "requireOwnedBy", "", "getViewModelName", "(Lp/lnm;)Ljava/lang/Object;", "getName", "propertyPath", "Lp/mr20;", "", "getNumberFlow", "(Ljava/lang/String;)Lp/mr20;", "getStringFlow", "", "getBooleanFlow", "getEnumFlow", "", "getColorFlow", "getTriggerFlow", "value", "setNumber", "(Ljava/lang/String;F)V", "setString", "(Ljava/lang/String;Ljava/lang/String;)V", "setBoolean", "(Ljava/lang/String;Z)V", "setEnum", "setColor", "(Ljava/lang/String;I)V", "fireTrigger", "(Ljava/lang/String;)V", "Lapp/rive/ImageAsset;", "image", "setImage", "(Ljava/lang/String;Lapp/rive/ImageAsset;)V", "Lapp/rive/FontAsset;", "font", "setFont", "(Ljava/lang/String;Lapp/rive/FontAsset;)V", "Lapp/rive/Artboard;", "artboard", "setArtboard", "(Ljava/lang/String;Lapp/rive/Artboard;)V", "instance", "setViewModelInstance", "(Ljava/lang/String;Lapp/rive/ViewModelInstance;)V", "getListSize", "(Ljava/lang/String;Lp/lnm;)Ljava/lang/Object;", "index", "item", "insertToListAtIndex", "(Ljava/lang/String;ILapp/rive/ViewModelInstance;)V", "appendToList", "removeFromListAtIndex", "removeFromList", "indexA", "indexB", "swapListItems", "(Ljava/lang/String;II)V", "T", "completeWhenClosed", "(Lp/mr20;)Lp/mr20;", "", "cache", "Lkotlin/Function3;", "Lp/lnm;", "", "getter", "Lp/at71;", "Lapp/rive/core/CommandQueue$PropertyUpdate;", "Lapp/rive/core/RivePropertyUpdate;", "updateFlow", "Lapp/rive/runtime/kotlin/core/ViewModel$PropertyDataType;", "propertyType", "getPropertyFlow", "(Ljava/lang/String;Ljava/util/Map;Lp/xu30;Lp/at71;Lapp/rive/runtime/kotlin/core/ViewModel$PropertyDataType;)Lp/mr20;", "setter", "setProperty", "(Ljava/lang/String;Ljava/lang/Object;Lp/xu30;)V", "J", "getInstanceHandle-VPLto4w", "()J", "Lapp/rive/core/CommandQueue;", "Lp/sen0;", "closeFlow", "Lp/sen0;", "Lapp/rive/PropertySubscriptions;", "propertySubscriptions", "Lapp/rive/PropertySubscriptions;", "Lapp/rive/core/CloseOnce;", "closer", "Lapp/rive/core/CloseOnce;", "_dirtyFlow", "dirtyFlow", "Lp/at71;", "getDirtyFlow$kotlin_release", "()Lp/at71;", "numberFlows", "Ljava/util/Map;", "stringFlows", "booleanFlows", "enumFlows", "colorFlows", "triggerFlows", "getClosed", "()Z", "closed", "Companion", "kotlin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class ViewModelInstance implements CheckableAutoCloseable {
    private final sen0 _dirtyFlow;
    private final Map<String, mr20> booleanFlows;
    private final sen0 closeFlow;
    private final CloseOnce closer;
    private final Map<String, mr20> colorFlows;
    private final at71 dirtyFlow;
    private final Map<String, mr20> enumFlows;
    private final long fileHandle;
    private final long instanceHandle;
    private final Map<String, mr20> numberFlows;
    private final PropertySubscriptions propertySubscriptions;
    private final CommandQueue riveWorker;
    private final Map<String, mr20> stringFlows;
    private final Map<String, mr20> triggerFlows;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0086@¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lapp/rive/ViewModelInstance$Companion;", "", "<init>", "()V", "Lapp/rive/RiveFile;", "file", "Lapp/rive/ViewModelInstanceSource;", "source", "Lapp/rive/ViewModelInstance;", "create", "(Lapp/rive/RiveFile;Lapp/rive/ViewModelInstanceSource;Lp/lnm;)Ljava/lang/Object;", "fromFile", "(Lapp/rive/RiveFile;Lapp/rive/ViewModelInstanceSource;)Lapp/rive/ViewModelInstance;", "kotlin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        public final Object create(RiveFile riveFile, ViewModelInstanceSource viewModelInstanceSource, lnm<? super ViewModelInstance> lnmVar) throws Exception {
            ViewModelInstance$Companion$create$1 viewModelInstance$Companion$create$1;
            if (lnmVar instanceof ViewModelInstance$Companion$create$1) {
                viewModelInstance$Companion$create$1 = (ViewModelInstance$Companion$create$1) lnmVar;
                int i = viewModelInstance$Companion$create$1.label;
                if ((i & os00.INVALID_ID) != 0) {
                    viewModelInstance$Companion$create$1.label = i - os00.INVALID_ID;
                } else {
                    viewModelInstance$Companion$create$1 = new ViewModelInstance$Companion$create$1(this, lnmVar);
                }
            } else {
                viewModelInstance$Companion$create$1 = new ViewModelInstance$Companion$create$1(this, lnmVar);
            }
            Object objM220createViewModelInstanceConfirmedWT1fHeI = viewModelInstance$Companion$create$1.result;
            int i2 = viewModelInstance$Companion$create$1.label;
            try {
                if (i2 == 0) {
                    hm5.M(objM220createViewModelInstanceConfirmedWT1fHeI);
                    RiveLog.INSTANCE.getLogger().d(ViewModelInstanceKt.VM_INSTANCE_TAG, new ViewModelInstance$Companion$create$2(viewModelInstanceSource, riveFile));
                    riveFile.checkOpen$kotlin_release();
                    CommandQueue riveWorker = riveFile.getRiveWorker();
                    long fileHandle = riveFile.getFileHandle();
                    viewModelInstance$Companion$create$1.L$0 = riveFile;
                    viewModelInstance$Companion$create$1.L$1 = viewModelInstanceSource;
                    viewModelInstance$Companion$create$1.label = 1;
                    objM220createViewModelInstanceConfirmedWT1fHeI = riveWorker.m220createViewModelInstanceConfirmedWT1fHeI(fileHandle, viewModelInstanceSource, viewModelInstance$Companion$create$1);
                    d9n d9nVar = d9n.a;
                    if (objM220createViewModelInstanceConfirmedWT1fHeI == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (i2 != 1) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    viewModelInstanceSource = (ViewModelInstanceSource) viewModelInstance$Companion$create$1.L$1;
                    riveFile = (RiveFile) viewModelInstance$Companion$create$1.L$0;
                    hm5.M(objM220createViewModelInstanceConfirmedWT1fHeI);
                }
                long jM456unboximpl = ((ViewModelInstanceHandle) objM220createViewModelInstanceConfirmedWT1fHeI).m456unboximpl();
                RiveLog.INSTANCE.getLogger().d(ViewModelInstanceKt.VM_INSTANCE_TAG, new ViewModelInstance$Companion$create$3(jM456unboximpl, viewModelInstanceSource, riveFile));
                return new ViewModelInstance(jM456unboximpl, riveFile.getRiveWorker(), riveFile.getFileHandle(), null);
            } catch (CancellationException e) {
                RiveLog.INSTANCE.getLogger().d(ViewModelInstanceKt.VM_INSTANCE_TAG, new ViewModelInstance$Companion$create$4(viewModelInstanceSource, riveFile));
                throw e;
            } catch (Exception e2) {
                RiveLog.INSTANCE.getLogger().e(ViewModelInstanceKt.VM_INSTANCE_TAG, e2, new ViewModelInstance$Companion$create$5(viewModelInstanceSource, riveFile));
                throw e2;
            }
        }

        @adt
        public final ViewModelInstance fromFile(RiveFile file, ViewModelInstanceSource source) {
            file.checkOpen$kotlin_release();
            long jM219createViewModelInstancej73Dd8U = file.getRiveWorker().m219createViewModelInstancej73Dd8U(file.getFileHandle(), source);
            RiveLog.INSTANCE.getLogger().d(ViewModelInstanceKt.VM_INSTANCE_TAG, new ViewModelInstance$Companion$fromFile$1(jM219createViewModelInstancej73Dd8U, source, file));
            return new ViewModelInstance(jM219createViewModelInstancej73Dd8U, file.getRiveWorker(), file.getFileHandle(), null);
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: app.rive.ViewModelInstance$completeWhenClosed$1, reason: invalid class name */
    @q8r(c = "app.rive.ViewModelInstance$completeWhenClosed$1", f = "ViewModelInstance.kt", l = {450}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "Lp/ssw0;", "Lp/rih1;", "<anonymous>", "(Lp/ssw0;)V"}, k = 3, mv = {1, 9, 0})
    public static final class AnonymousClass1 extends a8d1 implements vu30 {
        final /* synthetic */ mr20 $this_completeWhenClosed;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ ViewModelInstance this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(mr20 mr20Var, ViewModelInstance viewModelInstance, lnm<? super AnonymousClass1> lnmVar) {
            super(2, lnmVar);
            this.$this_completeWhenClosed = mr20Var;
            this.this$0 = viewModelInstance;
        }

        public final lnm<rih1> create(Object obj, lnm<?> lnmVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$this_completeWhenClosed, this.this$0, lnmVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        public final Object invoke(ssw0 ssw0Var, lnm<? super rih1> lnmVar) {
            return create(ssw0Var, lnmVar).invokeSuspend(rih1.a);
        }

        public final Object invokeSuspend(Object obj) throws Throwable {
            Throwable th;
            faa0 faa0Var;
            int i = this.label;
            if (i != 0) {
                if (i != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                faa0Var = (faa0) this.L$0;
                try {
                    hm5.M(obj);
                    faa0Var.d((CancellationException) null);
                    return rih1.a;
                } catch (Throwable th2) {
                    th = th2;
                    faa0Var.d((CancellationException) null);
                    throw th;
                }
            }
            hm5.M(obj);
            ssw0 ssw0Var = (ssw0) this.L$0;
            xab1 xab1VarT = fn31.T(ssw0Var, null, 4, new ViewModelInstance$completeWhenClosed$1$updatesJob$1(this.$this_completeWhenClosed, ssw0Var, null), 1);
            faa0 faa0VarT = fn31.T(ssw0Var, null, 4, new ViewModelInstance$completeWhenClosed$1$closeJob$1(this.this$0, xab1VarT, null), 1);
            try {
                this.L$0 = faa0VarT;
                this.label = 1;
                Object objJ = xab1VarT.j(this);
                d9n d9nVar = d9n.a;
                if (objJ == d9nVar) {
                    return d9nVar;
                }
                faa0Var = faa0VarT;
                faa0Var.d((CancellationException) null);
                return rih1.a;
            } catch (Throwable th3) {
                th = th3;
                faa0Var = faa0VarT;
                faa0Var.d((CancellationException) null);
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: app.rive.ViewModelInstance$getBooleanFlow$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class C00551 extends tv30 implements xu30 {
        public C00551(Object obj) {
            super(3, obj, CommandQueue.class, "getBooleanProperty", "getBooleanProperty-iFQtAB8(JLjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return m123invokeiFQtAB8(((ViewModelInstanceHandle) obj).m456unboximpl(), (String) obj2, (lnm) obj3);
        }

        /* JADX INFO: renamed from: invoke-iFQtAB8, reason: not valid java name */
        public final Object m123invokeiFQtAB8(long j, String str, lnm<? super Boolean> lnmVar) {
            return ((CommandQueue) ((lyc) this).receiver).m242getBooleanPropertyiFQtAB8(j, str, lnmVar);
        }
    }

    /* JADX INFO: renamed from: app.rive.ViewModelInstance$getColorFlow$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class C00561 extends tv30 implements xu30 {
        public C00561(Object obj) {
            super(3, obj, CommandQueue.class, "getColorProperty", "getColorProperty-iFQtAB8(JLjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return m124invokeiFQtAB8(((ViewModelInstanceHandle) obj).m456unboximpl(), (String) obj2, (lnm) obj3);
        }

        /* JADX INFO: renamed from: invoke-iFQtAB8, reason: not valid java name */
        public final Object m124invokeiFQtAB8(long j, String str, lnm<? super Integer> lnmVar) {
            return ((CommandQueue) ((lyc) this).receiver).m243getColorPropertyiFQtAB8(j, str, lnmVar);
        }
    }

    /* JADX INFO: renamed from: app.rive.ViewModelInstance$getEnumFlow$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class C00571 extends tv30 implements xu30 {
        public C00571(Object obj) {
            super(3, obj, CommandQueue.class, "getEnumProperty", "getEnumProperty-iFQtAB8(JLjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return m125invokeiFQtAB8(((ViewModelInstanceHandle) obj).m456unboximpl(), (String) obj2, (lnm) obj3);
        }

        /* JADX INFO: renamed from: invoke-iFQtAB8, reason: not valid java name */
        public final Object m125invokeiFQtAB8(long j, String str, lnm<? super String> lnmVar) {
            return ((CommandQueue) ((lyc) this).receiver).m245getEnumPropertyiFQtAB8(j, str, lnmVar);
        }
    }

    /* JADX INFO: renamed from: app.rive.ViewModelInstance$getNumberFlow$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class C00581 extends tv30 implements xu30 {
        public C00581(Object obj) {
            super(3, obj, CommandQueue.class, "getNumberProperty", "getNumberProperty-iFQtAB8(JLjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return m126invokeiFQtAB8(((ViewModelInstanceHandle) obj).m456unboximpl(), (String) obj2, (lnm) obj3);
        }

        /* JADX INFO: renamed from: invoke-iFQtAB8, reason: not valid java name */
        public final Object m126invokeiFQtAB8(long j, String str, lnm<? super Float> lnmVar) {
            return ((CommandQueue) ((lyc) this).receiver).m249getNumberPropertyiFQtAB8(j, str, lnmVar);
        }
    }

    /* JADX INFO: renamed from: app.rive.ViewModelInstance$getStringFlow$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class C00591 extends tv30 implements xu30 {
        public C00591(Object obj) {
            super(3, obj, CommandQueue.class, "getStringProperty", "getStringProperty-iFQtAB8(JLjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return m127invokeiFQtAB8(((ViewModelInstanceHandle) obj).m456unboximpl(), (String) obj2, (lnm) obj3);
        }

        /* JADX INFO: renamed from: invoke-iFQtAB8, reason: not valid java name */
        public final Object m127invokeiFQtAB8(long j, String str, lnm<? super String> lnmVar) {
            return ((CommandQueue) ((lyc) this).receiver).m251getStringPropertyiFQtAB8(j, str, lnmVar);
        }
    }

    /* JADX INFO: renamed from: app.rive.ViewModelInstance$setArtboard$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class C00601 extends hab0 implements Function0 {
        final /* synthetic */ String $message;
        final /* synthetic */ String $propertyPath;
        final /* synthetic */ ViewModelInstance this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C00601(String str, String str2, ViewModelInstance viewModelInstance) {
            super(0);
            this.$message = str;
            this.$propertyPath = str2;
            this.this$0 = viewModelInstance;
        }

        public final String invoke() {
            return this.$message + " for " + this.$propertyPath + " (" + FileHandle.m372toStringimpl(this.this$0.fileHandle) + ")";
        }
    }

    /* JADX INFO: renamed from: app.rive.ViewModelInstance$setArtboard$2, reason: invalid class name */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class AnonymousClass2 extends tv30 implements xu30 {
        public AnonymousClass2(Object obj) {
            super(3, obj, CommandQueue.class, "setArtboardProperty", "setArtboardProperty-MFCOo3w(JLjava/lang/String;Lapp/rive/core/ArtboardHandle;)V", 0);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            m129invokeMFCOo3w(((ViewModelInstanceHandle) obj).m456unboximpl(), (String) obj2, (ArtboardHandle) obj3);
            return rih1.a;
        }

        /* JADX INFO: renamed from: invoke-MFCOo3w, reason: not valid java name */
        public final void m129invokeMFCOo3w(long j, String str, ArtboardHandle artboardHandle) {
            ((CommandQueue) ((lyc) this).receiver).m277setArtboardPropertyMFCOo3w(j, str, artboardHandle);
        }
    }

    /* JADX INFO: renamed from: app.rive.ViewModelInstance$setBoolean$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class C00611 extends tv30 implements xu30 {
        public C00611(Object obj) {
            super(3, obj, CommandQueue.class, "setBooleanProperty", "setBooleanProperty-iFQtAB8(JLjava/lang/String;Z)V", 0);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            m130invokeiFQtAB8(((ViewModelInstanceHandle) obj).m456unboximpl(), (String) obj2, ((Boolean) obj3).booleanValue());
            return rih1.a;
        }

        /* JADX INFO: renamed from: invoke-iFQtAB8, reason: not valid java name */
        public final void m130invokeiFQtAB8(long j, String str, boolean z) {
            ((CommandQueue) ((lyc) this).receiver).m279setBooleanPropertyiFQtAB8(j, str, z);
        }
    }

    /* JADX INFO: renamed from: app.rive.ViewModelInstance$setColor$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class C00621 extends tv30 implements xu30 {
        public C00621(Object obj) {
            super(3, obj, CommandQueue.class, "setColorProperty", "setColorProperty-iFQtAB8(JLjava/lang/String;I)V", 0);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            m131invokeiFQtAB8(((ViewModelInstanceHandle) obj).m456unboximpl(), (String) obj2, ((Number) obj3).intValue());
            return rih1.a;
        }

        /* JADX INFO: renamed from: invoke-iFQtAB8, reason: not valid java name */
        public final void m131invokeiFQtAB8(long j, String str, int i) {
            ((CommandQueue) ((lyc) this).receiver).m280setColorPropertyiFQtAB8(j, str, i);
        }
    }

    /* JADX INFO: renamed from: app.rive.ViewModelInstance$setEnum$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class C00631 extends tv30 implements xu30 {
        public C00631(Object obj) {
            super(3, obj, CommandQueue.class, "setEnumProperty", "setEnumProperty-iFQtAB8(JLjava/lang/String;Ljava/lang/String;)V", 0);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            m132invokeiFQtAB8(((ViewModelInstanceHandle) obj).m456unboximpl(), (String) obj2, (String) obj3);
            return rih1.a;
        }

        /* JADX INFO: renamed from: invoke-iFQtAB8, reason: not valid java name */
        public final void m132invokeiFQtAB8(long j, String str, String str2) {
            ((CommandQueue) ((lyc) this).receiver).m281setEnumPropertyiFQtAB8(j, str, str2);
        }
    }

    /* JADX INFO: renamed from: app.rive.ViewModelInstance$setFont$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class C00641 extends hab0 implements Function0 {
        final /* synthetic */ String $message;
        final /* synthetic */ String $propertyPath;
        final /* synthetic */ ViewModelInstance this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C00641(String str, String str2, ViewModelInstance viewModelInstance) {
            super(0);
            this.$message = str;
            this.$propertyPath = str2;
            this.this$0 = viewModelInstance;
        }

        public final String invoke() {
            return this.$message + " for " + this.$propertyPath + " (" + FileHandle.m372toStringimpl(this.this$0.fileHandle) + ")";
        }
    }

    /* JADX INFO: renamed from: app.rive.ViewModelInstance$setFont$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class C00652 extends tv30 implements xu30 {
        public C00652(Object obj) {
            super(3, obj, CommandQueue.class, "setFontProperty", "setFontProperty-po2uwC0(JLjava/lang/String;Lapp/rive/core/FontHandle;)V", 0);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            m134invokepo2uwC0(((ViewModelInstanceHandle) obj).m456unboximpl(), (String) obj2, (FontHandle) obj3);
            return rih1.a;
        }

        /* JADX INFO: renamed from: invoke-po2uwC0, reason: not valid java name */
        public final void m134invokepo2uwC0(long j, String str, FontHandle fontHandle) {
            ((CommandQueue) ((lyc) this).receiver).m282setFontPropertypo2uwC0(j, str, fontHandle);
        }
    }

    /* JADX INFO: renamed from: app.rive.ViewModelInstance$setImage$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class C00661 extends hab0 implements Function0 {
        final /* synthetic */ String $message;
        final /* synthetic */ String $propertyPath;
        final /* synthetic */ ViewModelInstance this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C00661(String str, String str2, ViewModelInstance viewModelInstance) {
            super(0);
            this.$message = str;
            this.$propertyPath = str2;
            this.this$0 = viewModelInstance;
        }

        public final String invoke() {
            return this.$message + " for " + this.$propertyPath + " (" + FileHandle.m372toStringimpl(this.this$0.fileHandle) + ")";
        }
    }

    /* JADX INFO: renamed from: app.rive.ViewModelInstance$setImage$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class C00672 extends tv30 implements xu30 {
        public C00672(Object obj) {
            super(3, obj, CommandQueue.class, "setImageProperty", "setImageProperty-uYCTyf4(JLjava/lang/String;Lapp/rive/core/ImageHandle;)V", 0);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            m136invokeuYCTyf4(((ViewModelInstanceHandle) obj).m456unboximpl(), (String) obj2, (ImageHandle) obj3);
            return rih1.a;
        }

        /* JADX INFO: renamed from: invoke-uYCTyf4, reason: not valid java name */
        public final void m136invokeuYCTyf4(long j, String str, ImageHandle imageHandle) {
            ((CommandQueue) ((lyc) this).receiver).m284setImagePropertyuYCTyf4(j, str, imageHandle);
        }
    }

    /* JADX INFO: renamed from: app.rive.ViewModelInstance$setNumber$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class C00681 extends tv30 implements xu30 {
        public C00681(Object obj) {
            super(3, obj, CommandQueue.class, "setNumberProperty", "setNumberProperty-iFQtAB8(JLjava/lang/String;F)V", 0);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            m137invokeiFQtAB8(((ViewModelInstanceHandle) obj).m456unboximpl(), (String) obj2, ((Number) obj3).floatValue());
            return rih1.a;
        }

        /* JADX INFO: renamed from: invoke-iFQtAB8, reason: not valid java name */
        public final void m137invokeiFQtAB8(long j, String str, float f) {
            ((CommandQueue) ((lyc) this).receiver).m286setNumberPropertyiFQtAB8(j, str, f);
        }
    }

    /* JADX INFO: renamed from: app.rive.ViewModelInstance$setString$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class C00691 extends tv30 implements xu30 {
        public C00691(Object obj) {
            super(3, obj, CommandQueue.class, "setStringProperty", "setStringProperty-iFQtAB8(JLjava/lang/String;Ljava/lang/String;)V", 0);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            m138invokeiFQtAB8(((ViewModelInstanceHandle) obj).m456unboximpl(), (String) obj2, (String) obj3);
            return rih1.a;
        }

        /* JADX INFO: renamed from: invoke-iFQtAB8, reason: not valid java name */
        public final void m138invokeiFQtAB8(long j, String str, String str2) {
            ((CommandQueue) ((lyc) this).receiver).m287setStringPropertyiFQtAB8(j, str, str2);
        }
    }

    /* JADX INFO: renamed from: app.rive.ViewModelInstance$setViewModelInstance$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class C00701 extends hab0 implements Function0 {
        final /* synthetic */ String $propertyPath;
        final /* synthetic */ ViewModelInstance this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C00701(String str, ViewModelInstance viewModelInstance) {
            super(0);
            this.$propertyPath = str;
            this.this$0 = viewModelInstance;
        }

        public final String invoke() {
            ViewModelInstance viewModelInstance = ViewModelInstance.this;
            String str = this.$propertyPath;
            String strM372toStringimpl = FileHandle.m372toStringimpl(this.this$0.fileHandle);
            StringBuilder sb = new StringBuilder("Assigning ");
            sb.append(viewModelInstance);
            sb.append(" to ");
            sb.append(str);
            sb.append(" (");
            return l1d.n(strM372toStringimpl, ")", sb);
        }
    }

    /* JADX INFO: renamed from: app.rive.ViewModelInstance$setViewModelInstance$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class C00712 extends tv30 implements xu30 {
        public C00712(Object obj) {
            super(3, obj, CommandQueue.class, "setViewModelInstanceProperty", "setViewModelInstanceProperty-Y8k3COA(JLjava/lang/String;J)V", 0);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            m140invokeY8k3COA(((ViewModelInstanceHandle) obj).m456unboximpl(), (String) obj2, ((ViewModelInstanceHandle) obj3).m456unboximpl());
            return rih1.a;
        }

        /* JADX INFO: renamed from: invoke-Y8k3COA, reason: not valid java name */
        public final void m140invokeY8k3COA(long j, String str, long j2) {
            ((CommandQueue) ((lyc) this).receiver).m288setViewModelInstancePropertyY8k3COA(j, str, j2);
        }
    }

    private ViewModelInstance(long j, CommandQueue commandQueue, long j2) {
        this.instanceHandle = j;
        this.riveWorker = commandQueue;
        this.fileHandle = j2;
        this.closeFlow = mgo1.e(1, 0, 0, 6);
        this.propertySubscriptions = new PropertySubscriptions(commandQueue, j, null);
        this.closer = new CloseOnce(ViewModelInstanceHandle.m455toStringimpl(j), new ViewModelInstance$closer$1(this));
        dt71 dt71VarD = mgo1.d(1, 1, 2);
        this._dirtyFlow = dt71VarD;
        this.dirtyFlow = dt71VarD;
        this.numberFlows = new LinkedHashMap();
        this.stringFlows = new LinkedHashMap();
        this.booleanFlows = new LinkedHashMap();
        this.enumFlows = new LinkedHashMap();
        this.colorFlows = new LinkedHashMap();
        this.triggerFlows = new LinkedHashMap();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final <T> mr20 completeWhenClosed(mr20 mr20Var) {
        return o4p1.k(h4p1.g(new AnonymousClass1(mr20Var, this, null)), 0, 2);
    }

    private final <T> mr20 getPropertyFlow(String propertyPath, Map<String, mr20> cache, xu30 getter, at71 updateFlow, ViewModel.PropertyDataType propertyType) {
        this.closer.checkOpen();
        m441 m441Var = cache.get(propertyPath);
        if (m441Var == null) {
            m441Var = new m441(new ViewModelInstance$getPropertyFlow$1$1(this, propertyPath, propertyType, updateFlow, getter, null));
            cache.put(propertyPath, m441Var);
        }
        return (mr20) m441Var;
    }

    private final <T> void setProperty(String propertyPath, T value, xu30 setter) {
        this.closer.checkOpen();
        setter.invoke(ViewModelInstanceHandle.m450boximpl(this.instanceHandle), propertyPath, value);
        this._dirtyFlow.a(rih1.a);
    }

    public final void appendToList(String propertyPath, ViewModelInstance item) {
        this.closer.checkOpen();
        item.checkOpen$kotlin_release();
        item.requireOwnedBy$kotlin_release(this.riveWorker);
        this.riveWorker.m203appendToListY8k3COA(this.instanceHandle, propertyPath, item.instanceHandle);
        this._dirtyFlow.a(rih1.a);
    }

    public final void checkOpen$kotlin_release() {
        this.closer.checkOpen();
    }

    @Override // app.p000rive.core.CheckableAutoCloseable, java.lang.AutoCloseable
    public void close() {
        this.closer.close();
    }

    public final void fireTrigger(String propertyPath) {
        this.closer.checkOpen();
        this.riveWorker.m236fireTriggerPropertyippgHXQ(this.instanceHandle, propertyPath);
        this._dirtyFlow.a(rih1.a);
    }

    public final mr20 getBooleanFlow(String propertyPath) {
        this.closer.checkOpen();
        return getPropertyFlow(propertyPath, this.booleanFlows, new C00551(this.riveWorker), this.riveWorker.getBooleanPropertyFlow(), ViewModel.PropertyDataType.BOOLEAN);
    }

    @Override // app.p000rive.core.CheckableAutoCloseable
    public boolean getClosed() {
        return this.closer.getClosed();
    }

    public final mr20 getColorFlow(String propertyPath) {
        this.closer.checkOpen();
        return getPropertyFlow(propertyPath, this.colorFlows, new C00561(this.riveWorker), this.riveWorker.getColorPropertyFlow(), ViewModel.PropertyDataType.COLOR);
    }

    /* JADX INFO: renamed from: getDirtyFlow$kotlin_release, reason: from getter */
    public final at71 getDirtyFlow() {
        return this.dirtyFlow;
    }

    public final mr20 getEnumFlow(String propertyPath) {
        this.closer.checkOpen();
        return getPropertyFlow(propertyPath, this.enumFlows, new C00571(this.riveWorker), this.riveWorker.getEnumPropertyFlow(), ViewModel.PropertyDataType.ENUM);
    }

    /* JADX INFO: renamed from: getInstanceHandle-VPLto4w, reason: not valid java name and from getter */
    public final long getInstanceHandle() {
        return this.instanceHandle;
    }

    public final Object getListSize(String str, lnm<? super Integer> lnmVar) {
        this.closer.checkOpen();
        return this.riveWorker.m248getListSizeiFQtAB8(this.instanceHandle, str, lnmVar);
    }

    public final Object getName(lnm<? super String> lnmVar) {
        this.closer.checkOpen();
        return this.riveWorker.m252getViewModelInstanceNameippgHXQ(this.instanceHandle, lnmVar);
    }

    public final mr20 getNumberFlow(String propertyPath) {
        this.closer.checkOpen();
        return getPropertyFlow(propertyPath, this.numberFlows, new C00581(this.riveWorker), this.riveWorker.getNumberPropertyFlow(), ViewModel.PropertyDataType.NUMBER);
    }

    public final mr20 getStringFlow(String propertyPath) {
        this.closer.checkOpen();
        return getPropertyFlow(propertyPath, this.stringFlows, new C00591(this.riveWorker), this.riveWorker.getStringPropertyFlow(), ViewModel.PropertyDataType.STRING);
    }

    public final mr20 getTriggerFlow(String propertyPath) {
        this.closer.checkOpen();
        Map<String, mr20> map = this.triggerFlows;
        mr20 mr20Var = map.get(propertyPath);
        if (mr20Var == null) {
            mr20 m441Var = new m441(new ViewModelInstance$getTriggerFlow$1$1(this, propertyPath, null));
            map.put(propertyPath, m441Var);
            mr20Var = m441Var;
        }
        return mr20Var;
    }

    public final Object getViewModelName(lnm<? super String> lnmVar) {
        this.closer.checkOpen();
        return this.riveWorker.m254getViewModelInstanceViewModelNameippgHXQ(this.instanceHandle, lnmVar);
    }

    public final void insertToListAtIndex(String propertyPath, int index, ViewModelInstance item) {
        this.closer.checkOpen();
        item.checkOpen$kotlin_release();
        item.requireOwnedBy$kotlin_release(this.riveWorker);
        this.riveWorker.m259insertToListAtIndex4ua1WBo(this.instanceHandle, propertyPath, index, item.instanceHandle);
        this._dirtyFlow.a(rih1.a);
    }

    public final void removeFromList(String propertyPath, ViewModelInstance item) {
        this.closer.checkOpen();
        item.checkOpen$kotlin_release();
        item.requireOwnedBy$kotlin_release(this.riveWorker);
        this.riveWorker.m269removeFromListY8k3COA(this.instanceHandle, propertyPath, item.instanceHandle);
        this._dirtyFlow.a(rih1.a);
    }

    public final void removeFromListAtIndex(String propertyPath, int index) {
        this.closer.checkOpen();
        this.riveWorker.m270removeFromListAtIndexiFQtAB8(this.instanceHandle, propertyPath, index);
        this._dirtyFlow.a(rih1.a);
    }

    public final void requireOwnedBy$kotlin_release(CommandQueue worker) {
        if (this.riveWorker != worker) {
            throw new RiveIncompatibleResourceException(f4i1.f("ViewModelInstance ", ViewModelInstanceHandle.m455toStringimpl(this.instanceHandle), " is not owned by the required RiveWorker"));
        }
    }

    public final void setArtboard(String propertyPath, Artboard artboard) {
        String str;
        this.closer.checkOpen();
        if (artboard != null) {
            artboard.checkOpen$kotlin_release();
        }
        if (artboard != null) {
            artboard.requireOwnedBy$kotlin_release(this.riveWorker);
        }
        if (artboard != null) {
            str = "Assigning " + artboard;
        } else {
            str = "Clearing artboard";
        }
        RiveLog.INSTANCE.getLogger().d(ViewModelInstanceKt.VM_INSTANCE_TAG, new C00601(str, propertyPath, this));
        setProperty(propertyPath, artboard != null ? ArtboardHandle.m178boximpl(artboard.getArtboardHandle()) : null, new AnonymousClass2(this.riveWorker));
    }

    public final void setBoolean(String propertyPath, boolean value) {
        setProperty(propertyPath, Boolean.valueOf(value), new C00611(this.riveWorker));
    }

    public final void setColor(String propertyPath, int value) {
        setProperty(propertyPath, Integer.valueOf(value), new C00621(this.riveWorker));
    }

    public final void setEnum(String propertyPath, String value) {
        setProperty(propertyPath, value, new C00631(this.riveWorker));
    }

    public final void setFont(String propertyPath, FontAsset font) {
        String str;
        this.closer.checkOpen();
        if (font != null) {
            font.checkOpen$kotlin_release();
        }
        if (font != null) {
            font.requireOwnedBy$kotlin_release(this.riveWorker);
        }
        if (font != null) {
            str = "Assigning " + font;
        } else {
            str = "Clearing font";
        }
        RiveLog.INSTANCE.getLogger().d(ViewModelInstanceKt.VM_INSTANCE_TAG, new C00641(str, propertyPath, this));
        setProperty(propertyPath, font != null ? font.getHandle() : null, new C00652(this.riveWorker));
    }

    public final void setImage(String propertyPath, ImageAsset image) {
        String str;
        this.closer.checkOpen();
        if (image != null) {
            image.checkOpen$kotlin_release();
        }
        if (image != null) {
            image.requireOwnedBy$kotlin_release(this.riveWorker);
        }
        if (image != null) {
            str = "Assigning " + image;
        } else {
            str = "Clearing image";
        }
        RiveLog.INSTANCE.getLogger().d(ViewModelInstanceKt.VM_INSTANCE_TAG, new C00661(str, propertyPath, this));
        setProperty(propertyPath, image != null ? image.getHandle() : null, new C00672(this.riveWorker));
    }

    public final void setNumber(String propertyPath, float value) {
        setProperty(propertyPath, Float.valueOf(value), new C00681(this.riveWorker));
    }

    public final void setString(String propertyPath, String value) {
        setProperty(propertyPath, value, new C00691(this.riveWorker));
    }

    public final void setViewModelInstance(String propertyPath, ViewModelInstance instance) {
        this.closer.checkOpen();
        instance.checkOpen$kotlin_release();
        instance.requireOwnedBy$kotlin_release(this.riveWorker);
        RiveLog.INSTANCE.getLogger().d(ViewModelInstanceKt.VM_INSTANCE_TAG, instance.new C00701(propertyPath, this));
        setProperty(propertyPath, ViewModelInstanceHandle.m450boximpl(instance.instanceHandle), new C00712(this.riveWorker));
    }

    public final void swapListItems(String propertyPath, int indexA, int indexB) {
        this.closer.checkOpen();
        this.riveWorker.m291swapListItemsC5vwGj0(this.instanceHandle, propertyPath, indexA, indexB);
        this._dirtyFlow.a(rih1.a);
    }

    public /* synthetic */ ViewModelInstance(long j, CommandQueue commandQueue, long j2, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, commandQueue, j2);
    }
}
