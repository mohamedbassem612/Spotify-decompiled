package com.spotify.browse.clientnative.mobius;

import java.util.Set;
import kotlin.Metadata;
import p.eww0;
import p.jce0;
import p.u890;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\b\u0005\u0006\u0007\b\t\n\u000b\fJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004\u0082\u0001\b\n\r\b\t\u000b\f\u000e\u000fø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0010À\u0006\u0001"}, d2 = {"Lcom/spotify/browse/clientnative/mobius/BrowseEvent;", "", "", "breadcrumb", "()Ljava/lang/String;", "StructureLoaded", "StructureLoadFailed", "ExplicitFeedbackListChanged", "p/o7c", "p/p7c", "p/n7c", "p/q7c", "p/r7c", "Lcom/spotify/browse/clientnative/mobius/BrowseEvent$ExplicitFeedbackListChanged;", "Lcom/spotify/browse/clientnative/mobius/BrowseEvent$StructureLoadFailed;", "Lcom/spotify/browse/clientnative/mobius/BrowseEvent$StructureLoaded;", "src_main_java_com_spotify_browse_clientnative-clientnative"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface BrowseEvent {

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\t\u001a\u00020\u0004H\u0016J\u000f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\u000b\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0014\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0083\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004J\n\u0010\u0012\u001a\u00020\u0004HÖ\u0081\u0004R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/spotify/browse/clientnative/mobius/BrowseEvent$ExplicitFeedbackListChanged;", "Lcom/spotify/browse/clientnative/mobius/BrowseEvent;", "entityUris", "", "", "<init>", "(Ljava/util/Set;)V", "getEntityUris", "()Ljava/util/Set;", "breadcrumb", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "src_main_java_com_spotify_browse_clientnative-clientnative"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ExplicitFeedbackListChanged implements BrowseEvent {
        public static final int $stable = 0;
        private final Set<String> entityUris;

        public ExplicitFeedbackListChanged(Set<String> set) {
            this.entityUris = set;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ExplicitFeedbackListChanged copy$default(ExplicitFeedbackListChanged explicitFeedbackListChanged, Set set, int i, Object obj) {
            if ((i & 1) != 0) {
                set = explicitFeedbackListChanged.entityUris;
            }
            return explicitFeedbackListChanged.copy(set);
        }

        @Override // com.spotify.browse.clientnative.mobius.BrowseEvent
        public String breadcrumb() {
            return "ExplicitFeedbackListChanged: " + this.entityUris;
        }

        public final Set<String> component1() {
            return this.entityUris;
        }

        public final ExplicitFeedbackListChanged copy(Set<String> entityUris) {
            return new ExplicitFeedbackListChanged(entityUris);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ExplicitFeedbackListChanged) && u890.j(this.entityUris, ((ExplicitFeedbackListChanged) other).entityUris);
        }

        public final Set<String> getEntityUris() {
            return this.entityUris;
        }

        public int hashCode() {
            return this.entityUris.hashCode();
        }

        public String toString() {
            return super.toString();
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\u000b¨\u0006\u001d"}, d2 = {"Lcom/spotify/browse/clientnative/mobius/BrowseEvent$StructureLoadFailed;", "Lcom/spotify/browse/clientnative/mobius/BrowseEvent;", "Lp/jce0;", "loadingStrategy", "", "throwable", "<init>", "(Lp/jce0;Ljava/lang/Throwable;)V", "component1", "()Lp/jce0;", "component2", "()Ljava/lang/Throwable;", "copy", "(Lp/jce0;Ljava/lang/Throwable;)Lcom/spotify/browse/clientnative/mobius/BrowseEvent$StructureLoadFailed;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lp/jce0;", "getLoadingStrategy", "Ljava/lang/Throwable;", "getThrowable", "src_main_java_com_spotify_browse_clientnative-clientnative"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class StructureLoadFailed implements BrowseEvent {
        public static final int $stable = 8;
        private final jce0 loadingStrategy;
        private final Throwable throwable;

        public StructureLoadFailed(jce0 jce0Var, Throwable th) {
            this.loadingStrategy = jce0Var;
            this.throwable = th;
        }

        public static /* synthetic */ StructureLoadFailed copy$default(StructureLoadFailed structureLoadFailed, jce0 jce0Var, Throwable th, int i, Object obj) {
            if ((i & 1) != 0) {
                jce0Var = structureLoadFailed.loadingStrategy;
            }
            if ((i & 2) != 0) {
                th = structureLoadFailed.throwable;
            }
            return structureLoadFailed.copy(jce0Var, th);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final jce0 getLoadingStrategy() {
            return this.loadingStrategy;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final Throwable getThrowable() {
            return this.throwable;
        }

        public final StructureLoadFailed copy(jce0 loadingStrategy, Throwable throwable) {
            return new StructureLoadFailed(loadingStrategy, throwable);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof StructureLoadFailed)) {
                return false;
            }
            StructureLoadFailed structureLoadFailed = (StructureLoadFailed) other;
            return this.loadingStrategy == structureLoadFailed.loadingStrategy && u890.j(this.throwable, structureLoadFailed.throwable);
        }

        public final jce0 getLoadingStrategy() {
            return this.loadingStrategy;
        }

        public final Throwable getThrowable() {
            return this.throwable;
        }

        public int hashCode() {
            return this.throwable.hashCode() + (this.loadingStrategy.hashCode() * 31);
        }

        public String toString() {
            return super.toString();
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J8\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\"\u001a\u0004\b#\u0010\u000fR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010$\u001a\u0004\b%\u0010\u0011R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010&\u001a\u0004\b'\u0010\u0013¨\u0006("}, d2 = {"Lcom/spotify/browse/clientnative/mobius/BrowseEvent$StructureLoaded;", "Lcom/spotify/browse/clientnative/mobius/BrowseEvent;", "Lp/eww0;", "profile", "Lcom/spotify/browse/clientnative/mobius/Model;", "browsitaContent", "Lp/jce0;", "loadingStrategy", "", "shouldShowDSABanner", "<init>", "(Lp/eww0;Lcom/spotify/browse/clientnative/mobius/Model;Lp/jce0;Z)V", "component1", "()Lp/eww0;", "component2", "()Lcom/spotify/browse/clientnative/mobius/Model;", "component3", "()Lp/jce0;", "component4", "()Z", "copy", "(Lp/eww0;Lcom/spotify/browse/clientnative/mobius/Model;Lp/jce0;Z)Lcom/spotify/browse/clientnative/mobius/BrowseEvent$StructureLoaded;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lp/eww0;", "getProfile", "Lcom/spotify/browse/clientnative/mobius/Model;", "getBrowsitaContent", "Lp/jce0;", "getLoadingStrategy", "Z", "getShouldShowDSABanner", "src_main_java_com_spotify_browse_clientnative-clientnative"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class StructureLoaded implements BrowseEvent {
        public static final int $stable = 8;
        private final Model browsitaContent;
        private final jce0 loadingStrategy;
        private final eww0 profile;
        private final boolean shouldShowDSABanner;

        public StructureLoaded(eww0 eww0Var, Model model, jce0 jce0Var, boolean z) {
            this.profile = eww0Var;
            this.browsitaContent = model;
            this.loadingStrategy = jce0Var;
            this.shouldShowDSABanner = z;
        }

        public static /* synthetic */ StructureLoaded copy$default(StructureLoaded structureLoaded, eww0 eww0Var, Model model, jce0 jce0Var, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                eww0Var = structureLoaded.profile;
            }
            if ((i & 2) != 0) {
                model = structureLoaded.browsitaContent;
            }
            if ((i & 4) != 0) {
                jce0Var = structureLoaded.loadingStrategy;
            }
            if ((i & 8) != 0) {
                z = structureLoaded.shouldShowDSABanner;
            }
            return structureLoaded.copy(eww0Var, model, jce0Var, z);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final eww0 getProfile() {
            return this.profile;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final Model getBrowsitaContent() {
            return this.browsitaContent;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final jce0 getLoadingStrategy() {
            return this.loadingStrategy;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final boolean getShouldShowDSABanner() {
            return this.shouldShowDSABanner;
        }

        public final StructureLoaded copy(eww0 profile, Model browsitaContent, jce0 loadingStrategy, boolean shouldShowDSABanner) {
            return new StructureLoaded(profile, browsitaContent, loadingStrategy, shouldShowDSABanner);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof StructureLoaded)) {
                return false;
            }
            StructureLoaded structureLoaded = (StructureLoaded) other;
            return u890.j(this.profile, structureLoaded.profile) && u890.j(this.browsitaContent, structureLoaded.browsitaContent) && this.loadingStrategy == structureLoaded.loadingStrategy && this.shouldShowDSABanner == structureLoaded.shouldShowDSABanner;
        }

        public final Model getBrowsitaContent() {
            return this.browsitaContent;
        }

        public final jce0 getLoadingStrategy() {
            return this.loadingStrategy;
        }

        public final eww0 getProfile() {
            return this.profile;
        }

        public final boolean getShouldShowDSABanner() {
            return this.shouldShowDSABanner;
        }

        public int hashCode() {
            return Boolean.hashCode(this.shouldShowDSABanner) + ((this.loadingStrategy.hashCode() + ((this.browsitaContent.hashCode() + (this.profile.hashCode() * 31)) * 31)) * 31);
        }

        public String toString() {
            return super.toString();
        }
    }

    default String breadcrumb() {
        return getClass().getSimpleName();
    }
}
