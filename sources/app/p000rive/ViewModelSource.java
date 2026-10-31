package app.p000rive;

import kotlin.Metadata;
import p.f4i1;
import p.u890;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\b\tJ\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H\u0016\u0082\u0001\u0002\n\u000b¨\u0006\f"}, d2 = {"Lapp/rive/ViewModelSource;", "", "blankInstance", "Lapp/rive/ViewModelInstanceSource;", "defaultInstance", "namedInstance", "instanceName", "", "DefaultForArtboard", "Named", "Lapp/rive/ViewModelSource$DefaultForArtboard;", "Lapp/rive/ViewModelSource$Named;", "kotlin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface ViewModelSource {

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087@\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0088\u0001\u0002¨\u0006\u0016"}, d2 = {"Lapp/rive/ViewModelSource$DefaultForArtboard;", "Lapp/rive/ViewModelSource;", "artboard", "Lapp/rive/Artboard;", "constructor-impl", "(Lapp/rive/Artboard;)Lapp/rive/Artboard;", "getArtboard", "()Lapp/rive/Artboard;", "equals", "", "other", "", "equals-impl", "(Lapp/rive/Artboard;Ljava/lang/Object;)Z", "hashCode", "", "hashCode-impl", "(Lapp/rive/Artboard;)I", "toString", "", "toString-impl", "(Lapp/rive/Artboard;)Ljava/lang/String;", "kotlin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class DefaultForArtboard implements ViewModelSource {
        private final Artboard artboard;

        private /* synthetic */ DefaultForArtboard(Artboard artboard) {
            this.artboard = artboard;
        }

        /* JADX INFO: renamed from: blankInstance-impl, reason: not valid java name */
        public static ViewModelInstanceSource m158blankInstanceimpl(Artboard artboard) {
            return m159boximpl(artboard).blankInstance();
        }

        /* JADX INFO: renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ DefaultForArtboard m159boximpl(Artboard artboard) {
            return new DefaultForArtboard(artboard);
        }

        /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
        public static Artboard m160constructorimpl(Artboard artboard) {
            return artboard;
        }

        /* JADX INFO: renamed from: defaultInstance-impl, reason: not valid java name */
        public static ViewModelInstanceSource m161defaultInstanceimpl(Artboard artboard) {
            return m159boximpl(artboard).defaultInstance();
        }

        /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
        public static boolean m162equalsimpl(Artboard artboard, Object obj) {
            return (obj instanceof DefaultForArtboard) && u890.j(artboard, ((DefaultForArtboard) obj).m167unboximpl());
        }

        /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m163equalsimpl0(Artboard artboard, Artboard artboard2) {
            return u890.j(artboard, artboard2);
        }

        /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
        public static int m164hashCodeimpl(Artboard artboard) {
            return artboard.hashCode();
        }

        /* JADX INFO: renamed from: namedInstance-impl, reason: not valid java name */
        public static ViewModelInstanceSource m165namedInstanceimpl(Artboard artboard, String str) {
            return m159boximpl(artboard).namedInstance(str);
        }

        /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
        public static String m166toStringimpl(Artboard artboard) {
            return "DefaultForArtboard(artboard=" + artboard + ")";
        }

        @Override // app.p000rive.ViewModelSource
        public ViewModelInstanceSource blankInstance() {
            return DefaultImpls.blankInstance(this);
        }

        @Override // app.p000rive.ViewModelSource
        public ViewModelInstanceSource defaultInstance() {
            return DefaultImpls.defaultInstance(this);
        }

        public boolean equals(Object obj) {
            return m162equalsimpl(this.artboard, obj);
        }

        public final Artboard getArtboard() {
            return this.artboard;
        }

        public int hashCode() {
            return m164hashCodeimpl(this.artboard);
        }

        @Override // app.p000rive.ViewModelSource
        public ViewModelInstanceSource namedInstance(String str) {
            return DefaultImpls.namedInstance(this, str);
        }

        public String toString() {
            return m166toStringimpl(this.artboard);
        }

        /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
        public final /* synthetic */ Artboard m167unboximpl() {
            return this.artboard;
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class DefaultImpls {
        public static ViewModelInstanceSource blankInstance(ViewModelSource viewModelSource) {
            return ViewModelInstanceSource.Blank.m144boximpl(ViewModelInstanceSource.Blank.m145constructorimpl(viewModelSource));
        }

        public static ViewModelInstanceSource defaultInstance(ViewModelSource viewModelSource) {
            return ViewModelInstanceSource.Default.m151boximpl(ViewModelInstanceSource.Default.m152constructorimpl(viewModelSource));
        }

        public static ViewModelInstanceSource namedInstance(ViewModelSource viewModelSource, String str) {
            return new ViewModelInstanceSource.Named(viewModelSource, str);
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\b\u0087@\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0088\u0001\u0002¨\u0006\u0014"}, d2 = {"Lapp/rive/ViewModelSource$Named;", "Lapp/rive/ViewModelSource;", "viewModelName", "", "constructor-impl", "(Ljava/lang/String;)Ljava/lang/String;", "getViewModelName", "()Ljava/lang/String;", "equals", "", "other", "", "equals-impl", "(Ljava/lang/String;Ljava/lang/Object;)Z", "hashCode", "", "hashCode-impl", "(Ljava/lang/String;)I", "toString", "toString-impl", "kotlin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Named implements ViewModelSource {
        private final String viewModelName;

        private /* synthetic */ Named(String str) {
            this.viewModelName = str;
        }

        /* JADX INFO: renamed from: blankInstance-impl, reason: not valid java name */
        public static ViewModelInstanceSource m168blankInstanceimpl(String str) {
            return m169boximpl(str).blankInstance();
        }

        /* JADX INFO: renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ Named m169boximpl(String str) {
            return new Named(str);
        }

        /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
        public static String m170constructorimpl(String str) {
            return str;
        }

        /* JADX INFO: renamed from: defaultInstance-impl, reason: not valid java name */
        public static ViewModelInstanceSource m171defaultInstanceimpl(String str) {
            return m169boximpl(str).defaultInstance();
        }

        /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
        public static boolean m172equalsimpl(String str, Object obj) {
            return (obj instanceof Named) && u890.j(str, ((Named) obj).m177unboximpl());
        }

        /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m173equalsimpl0(String str, String str2) {
            return u890.j(str, str2);
        }

        /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
        public static int m174hashCodeimpl(String str) {
            return str.hashCode();
        }

        /* JADX INFO: renamed from: namedInstance-impl, reason: not valid java name */
        public static ViewModelInstanceSource m175namedInstanceimpl(String str, String str2) {
            return m169boximpl(str).namedInstance(str2);
        }

        /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
        public static String m176toStringimpl(String str) {
            return f4i1.f("Named(viewModelName=", str, ")");
        }

        @Override // app.p000rive.ViewModelSource
        public ViewModelInstanceSource blankInstance() {
            return DefaultImpls.blankInstance(this);
        }

        @Override // app.p000rive.ViewModelSource
        public ViewModelInstanceSource defaultInstance() {
            return DefaultImpls.defaultInstance(this);
        }

        public boolean equals(Object obj) {
            return m172equalsimpl(this.viewModelName, obj);
        }

        public final String getViewModelName() {
            return this.viewModelName;
        }

        public int hashCode() {
            return m174hashCodeimpl(this.viewModelName);
        }

        @Override // app.p000rive.ViewModelSource
        public ViewModelInstanceSource namedInstance(String str) {
            return DefaultImpls.namedInstance(this, str);
        }

        public String toString() {
            return m176toStringimpl(this.viewModelName);
        }

        /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
        public final /* synthetic */ String m177unboximpl() {
            return this.viewModelName;
        }
    }

    ViewModelInstanceSource blankInstance();

    ViewModelInstanceSource defaultInstance();

    ViewModelInstanceSource namedInstance(String instanceName);
}
