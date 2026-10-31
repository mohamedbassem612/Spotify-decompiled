package app.p000rive;

import kotlin.Metadata;
import p.cy30;
import p.gvg;
import p.u890;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\f"}, d2 = {"Lapp/rive/ViewModelInstanceSource;", "", "Blank", "Default", "Named", "Reference", "ReferenceListItem", "Lapp/rive/ViewModelInstanceSource$Blank;", "Lapp/rive/ViewModelInstanceSource$Default;", "Lapp/rive/ViewModelInstanceSource$Named;", "Lapp/rive/ViewModelInstanceSource$Reference;", "Lapp/rive/ViewModelInstanceSource$ReferenceListItem;", "kotlin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface ViewModelInstanceSource {

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087@\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0088\u0001\u0002¨\u0006\u0016"}, d2 = {"Lapp/rive/ViewModelInstanceSource$Blank;", "Lapp/rive/ViewModelInstanceSource;", "vmSource", "Lapp/rive/ViewModelSource;", "constructor-impl", "(Lapp/rive/ViewModelSource;)Lapp/rive/ViewModelSource;", "getVmSource", "()Lapp/rive/ViewModelSource;", "equals", "", "other", "", "equals-impl", "(Lapp/rive/ViewModelSource;Ljava/lang/Object;)Z", "hashCode", "", "hashCode-impl", "(Lapp/rive/ViewModelSource;)I", "toString", "", "toString-impl", "(Lapp/rive/ViewModelSource;)Ljava/lang/String;", "kotlin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Blank implements ViewModelInstanceSource {
        private final ViewModelSource vmSource;

        private /* synthetic */ Blank(ViewModelSource viewModelSource) {
            this.vmSource = viewModelSource;
        }

        /* JADX INFO: renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ Blank m144boximpl(ViewModelSource viewModelSource) {
            return new Blank(viewModelSource);
        }

        /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
        public static ViewModelSource m145constructorimpl(ViewModelSource viewModelSource) {
            return viewModelSource;
        }

        /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
        public static boolean m146equalsimpl(ViewModelSource viewModelSource, Object obj) {
            return (obj instanceof Blank) && u890.j(viewModelSource, ((Blank) obj).m150unboximpl());
        }

        /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m147equalsimpl0(ViewModelSource viewModelSource, ViewModelSource viewModelSource2) {
            return u890.j(viewModelSource, viewModelSource2);
        }

        /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
        public static int m148hashCodeimpl(ViewModelSource viewModelSource) {
            return viewModelSource.hashCode();
        }

        /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
        public static String m149toStringimpl(ViewModelSource viewModelSource) {
            return "Blank(vmSource=" + viewModelSource + ")";
        }

        public boolean equals(Object obj) {
            return m146equalsimpl(this.vmSource, obj);
        }

        public final ViewModelSource getVmSource() {
            return this.vmSource;
        }

        public int hashCode() {
            return m148hashCodeimpl(this.vmSource);
        }

        public String toString() {
            return m149toStringimpl(this.vmSource);
        }

        /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
        public final /* synthetic */ ViewModelSource m150unboximpl() {
            return this.vmSource;
        }
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087@\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0088\u0001\u0002¨\u0006\u0016"}, d2 = {"Lapp/rive/ViewModelInstanceSource$Default;", "Lapp/rive/ViewModelInstanceSource;", "vmSource", "Lapp/rive/ViewModelSource;", "constructor-impl", "(Lapp/rive/ViewModelSource;)Lapp/rive/ViewModelSource;", "getVmSource", "()Lapp/rive/ViewModelSource;", "equals", "", "other", "", "equals-impl", "(Lapp/rive/ViewModelSource;Ljava/lang/Object;)Z", "hashCode", "", "hashCode-impl", "(Lapp/rive/ViewModelSource;)I", "toString", "", "toString-impl", "(Lapp/rive/ViewModelSource;)Ljava/lang/String;", "kotlin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Default implements ViewModelInstanceSource {
        private final ViewModelSource vmSource;

        private /* synthetic */ Default(ViewModelSource viewModelSource) {
            this.vmSource = viewModelSource;
        }

        /* JADX INFO: renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ Default m151boximpl(ViewModelSource viewModelSource) {
            return new Default(viewModelSource);
        }

        /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
        public static ViewModelSource m152constructorimpl(ViewModelSource viewModelSource) {
            return viewModelSource;
        }

        /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
        public static boolean m153equalsimpl(ViewModelSource viewModelSource, Object obj) {
            return (obj instanceof Default) && u890.j(viewModelSource, ((Default) obj).m157unboximpl());
        }

        /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m154equalsimpl0(ViewModelSource viewModelSource, ViewModelSource viewModelSource2) {
            return u890.j(viewModelSource, viewModelSource2);
        }

        /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
        public static int m155hashCodeimpl(ViewModelSource viewModelSource) {
            return viewModelSource.hashCode();
        }

        /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
        public static String m156toStringimpl(ViewModelSource viewModelSource) {
            return "Default(vmSource=" + viewModelSource + ")";
        }

        public boolean equals(Object obj) {
            return m153equalsimpl(this.vmSource, obj);
        }

        public final ViewModelSource getVmSource() {
            return this.vmSource;
        }

        public int hashCode() {
            return m155hashCodeimpl(this.vmSource);
        }

        public String toString() {
            return m156toStringimpl(this.vmSource);
        }

        /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
        public final /* synthetic */ ViewModelSource m157unboximpl() {
            return this.vmSource;
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, d2 = {"Lapp/rive/ViewModelInstanceSource$Named;", "Lapp/rive/ViewModelInstanceSource;", "vmSource", "Lapp/rive/ViewModelSource;", "instanceName", "", "(Lapp/rive/ViewModelSource;Ljava/lang/String;)V", "getInstanceName", "()Ljava/lang/String;", "getVmSource", "()Lapp/rive/ViewModelSource;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "kotlin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Named implements ViewModelInstanceSource {
        public static final int $stable = 8;
        private final String instanceName;
        private final ViewModelSource vmSource;

        public Named(ViewModelSource viewModelSource, String str) {
            this.vmSource = viewModelSource;
            this.instanceName = str;
        }

        public static /* synthetic */ Named copy$default(Named named, ViewModelSource viewModelSource, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                viewModelSource = named.vmSource;
            }
            if ((i & 2) != 0) {
                str = named.instanceName;
            }
            return named.copy(viewModelSource, str);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final ViewModelSource getVmSource() {
            return this.vmSource;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getInstanceName() {
            return this.instanceName;
        }

        public final Named copy(ViewModelSource vmSource, String instanceName) {
            return new Named(vmSource, instanceName);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Named)) {
                return false;
            }
            Named named = (Named) other;
            return u890.j(this.vmSource, named.vmSource) && u890.j(this.instanceName, named.instanceName);
        }

        public final String getInstanceName() {
            return this.instanceName;
        }

        public final ViewModelSource getVmSource() {
            return this.vmSource;
        }

        public int hashCode() {
            return this.instanceName.hashCode() + (this.vmSource.hashCode() * 31);
        }

        public String toString() {
            return "Named(vmSource=" + this.vmSource + ", instanceName=" + this.instanceName + ")";
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, d2 = {"Lapp/rive/ViewModelInstanceSource$Reference;", "Lapp/rive/ViewModelInstanceSource;", "parentInstance", "Lapp/rive/ViewModelInstance;", "path", "", "(Lapp/rive/ViewModelInstance;Ljava/lang/String;)V", "getParentInstance", "()Lapp/rive/ViewModelInstance;", "getPath", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "kotlin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Reference implements ViewModelInstanceSource {
        public static final int $stable = 8;
        private final ViewModelInstance parentInstance;
        private final String path;

        public Reference(ViewModelInstance viewModelInstance, String str) {
            this.parentInstance = viewModelInstance;
            this.path = str;
        }

        public static /* synthetic */ Reference copy$default(Reference reference, ViewModelInstance viewModelInstance, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                viewModelInstance = reference.parentInstance;
            }
            if ((i & 2) != 0) {
                str = reference.path;
            }
            return reference.copy(viewModelInstance, str);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final ViewModelInstance getParentInstance() {
            return this.parentInstance;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getPath() {
            return this.path;
        }

        public final Reference copy(ViewModelInstance parentInstance, String path) {
            return new Reference(parentInstance, path);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Reference)) {
                return false;
            }
            Reference reference = (Reference) other;
            return u890.j(this.parentInstance, reference.parentInstance) && u890.j(this.path, reference.path);
        }

        public final ViewModelInstance getParentInstance() {
            return this.parentInstance;
        }

        public final String getPath() {
            return this.path;
        }

        public int hashCode() {
            return this.path.hashCode() + (this.parentInstance.hashCode() * 31);
        }

        public String toString() {
            return "Reference(parentInstance=" + this.parentInstance + ", path=" + this.path + ")";
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0007HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, d2 = {"Lapp/rive/ViewModelInstanceSource$ReferenceListItem;", "Lapp/rive/ViewModelInstanceSource;", "parentInstance", "Lapp/rive/ViewModelInstance;", "pathToList", "", "index", "", "(Lapp/rive/ViewModelInstance;Ljava/lang/String;I)V", "getIndex", "()I", "getParentInstance", "()Lapp/rive/ViewModelInstance;", "getPathToList", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "toString", "kotlin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ReferenceListItem implements ViewModelInstanceSource {
        public static final int $stable = 8;
        private final int index;
        private final ViewModelInstance parentInstance;
        private final String pathToList;

        public ReferenceListItem(ViewModelInstance viewModelInstance, String str, int i) {
            this.parentInstance = viewModelInstance;
            this.pathToList = str;
            this.index = i;
        }

        public static /* synthetic */ ReferenceListItem copy$default(ReferenceListItem referenceListItem, ViewModelInstance viewModelInstance, String str, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                viewModelInstance = referenceListItem.parentInstance;
            }
            if ((i2 & 2) != 0) {
                str = referenceListItem.pathToList;
            }
            if ((i2 & 4) != 0) {
                i = referenceListItem.index;
            }
            return referenceListItem.copy(viewModelInstance, str, i);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final ViewModelInstance getParentInstance() {
            return this.parentInstance;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getPathToList() {
            return this.pathToList;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final int getIndex() {
            return this.index;
        }

        public final ReferenceListItem copy(ViewModelInstance parentInstance, String pathToList, int index) {
            return new ReferenceListItem(parentInstance, pathToList, index);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ReferenceListItem)) {
                return false;
            }
            ReferenceListItem referenceListItem = (ReferenceListItem) other;
            return u890.j(this.parentInstance, referenceListItem.parentInstance) && u890.j(this.pathToList, referenceListItem.pathToList) && this.index == referenceListItem.index;
        }

        public final int getIndex() {
            return this.index;
        }

        public final ViewModelInstance getParentInstance() {
            return this.parentInstance;
        }

        public final String getPathToList() {
            return this.pathToList;
        }

        public int hashCode() {
            return Integer.hashCode(this.index) + cy30.d(this.parentInstance.hashCode() * 31, 31, this.pathToList);
        }

        public String toString() {
            ViewModelInstance viewModelInstance = this.parentInstance;
            String str = this.pathToList;
            int i = this.index;
            StringBuilder sb = new StringBuilder("ReferenceListItem(parentInstance=");
            sb.append(viewModelInstance);
            sb.append(", pathToList=");
            sb.append(str);
            sb.append(", index=");
            return gvg.j(sb, i, ")");
        }
    }
}
