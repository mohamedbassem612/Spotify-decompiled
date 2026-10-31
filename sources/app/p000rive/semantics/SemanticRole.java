package app.p000rive.semantics;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p.r0z;
import p.t0z;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0017\b\u0087\u0081\u0002\u0018\u0000 \u00192\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0019B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018¨\u0006\u001a"}, d2 = {"Lapp/rive/semantics/SemanticRole;", "", "value", "", "(Ljava/lang/String;II)V", "getValue", "()I", "None", "Button", "Link", "Checkbox", "SwitchControl", "Slider", "TextField", "Text", "Image", "Group", "List", "ListItem", "Tab", "TabList", "Dialog", "AlertDialog", "RadioGroup", "RadioButton", "Companion", "kotlin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public enum SemanticRole {
    None(0),
    Button(1),
    Link(2),
    Checkbox(3),
    SwitchControl(4),
    Slider(5),
    TextField(6),
    Text(7),
    Image(8),
    Group(9),
    List(10),
    ListItem(11),
    Tab(12),
    TabList(13),
    Dialog(14),
    AlertDialog(15),
    RadioGroup(16),
    RadioButton(17);

    private final int value;
    private static final /* synthetic */ r0z $ENTRIES = new t0z(values());

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lapp/rive/semantics/SemanticRole$Companion;", "", "()V", "fromValue", "Lapp/rive/semantics/SemanticRole;", "value", "", "kotlin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final SemanticRole fromValue(int value) {
            Object next;
            Iterator it = SemanticRole.getEntries().iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (((SemanticRole) next).getValue() != value);
            SemanticRole semanticRole = (SemanticRole) next;
            return semanticRole == null ? SemanticRole.None : semanticRole;
        }

        private Companion() {
        }
    }

    SemanticRole(int i) {
        this.value = i;
    }

    public static r0z getEntries() {
        return $ENTRIES;
    }

    public final int getValue() {
        return this.value;
    }
}
