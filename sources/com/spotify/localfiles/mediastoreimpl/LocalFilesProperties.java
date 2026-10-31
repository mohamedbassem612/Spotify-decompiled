package com.spotify.localfiles.mediastoreimpl;

import com.spotify.playlist.policy.proto.PlaylistDecorationPolicy;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p.aey0;
import p.fpb;
import p.idd1;
import p.luk;
import p.p7h;
import p.pdy0;
import p.znb0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0019\u0018\u0000 62\u00020\u0001:\u000267Ba\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0004\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fB\u0011\b\u0017\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u0010B\t\b\u0016¢\u0006\u0004\b\u000e\u0010\u0011BY\b\u0016\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0004¢\u0006\u0004\b\u000e\u0010\u001aJ\u0015\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010!\u001a\u00020\u00002\u0006\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b!\u0010\"J\u0015\u0010#\u001a\u00020\u00002\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b#\u0010\"R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010$R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010%R\u0014\u0010\u0006\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010%R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010%R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010%R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010%R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010%R\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010%R\u0016\u0010\r\u001a\u0004\u0018\u00010\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010&R\u001d\u0010+\u001a\u0004\u0018\u00010\u00008BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u0011\u0010\u0012\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b,\u0010-R\u0011\u0010\u0013\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b.\u0010/R\u0011\u0010\u0014\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b0\u0010/R\u0011\u0010\u0015\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b1\u0010/R\u0011\u0010\u0016\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b2\u0010/R\u0011\u0010\u0017\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b3\u0010/R\u0011\u0010\u0018\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b4\u0010/R\u0011\u0010\u0019\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b5\u0010/¨\u00068"}, d2 = {"Lcom/spotify/localfiles/mediastoreimpl/LocalFilesProperties;", "Lp/pdy0;", "", "_durationMin", "", "_includeAlarms", "_includeAudiobooks", "_includeMusic", "_includeNotifications", "_includePodcasts", "_includeRingtones", "_supportFileUriScheme", "Lp/luk;", "configProvider", "<init>", "(IZZZZZZZLp/luk;)V", "(Lp/luk;)V", "()V", "durationMin", "includeAlarms", "includeAudiobooks", "includeMusic", "includeNotifications", "includePodcasts", "includeRingtones", "supportFileUriScheme", "(IZZZZZZZ)V", "", "Lp/fpb;", "models", "()Ljava/util/List;", "Lp/aey0;", "parser", "fromParser", "(Lp/aey0;)Lcom/spotify/localfiles/mediastoreimpl/LocalFilesProperties;", "parse", "I", "Z", "Lp/luk;", "dataProps$delegate", "Lp/znb0;", "getDataProps", "()Lcom/spotify/localfiles/mediastoreimpl/LocalFilesProperties;", "dataProps", "getDurationMin", "()I", "getIncludeAlarms", "()Z", "getIncludeAudiobooks", "getIncludeMusic", "getIncludeNotifications", "getIncludePodcasts", "getIncludeRingtones", "getSupportFileUriScheme", "Companion", "TestHelper", "src_main_java_com_spotify_localfiles_mediastoreimpl-mediastoreimpl_properties_lib"}, k = 1, mv = {2, 3, 0}, xi = PlaylistDecorationPolicy.AI_CURATION_REFERENCE_ID_FIELD_NUMBER)
public final class LocalFilesProperties implements pdy0 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String SCOPE = "local-files";
    private final int _durationMin;
    private final boolean _includeAlarms;
    private final boolean _includeAudiobooks;
    private final boolean _includeMusic;
    private final boolean _includeNotifications;
    private final boolean _includePodcasts;
    private final boolean _includeRingtones;
    private final boolean _supportFileUriScheme;
    private final luk configProvider;

    /* JADX INFO: renamed from: dataProps$delegate, reason: from kotlin metadata */
    private final znb0 dataProps;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0006\u001a\u00020\u0007H\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/spotify/localfiles/mediastoreimpl/LocalFilesProperties$Companion;", "", "<init>", "()V", "SCOPE", "", "defaults", "Lcom/spotify/localfiles/mediastoreimpl/LocalFilesProperties;", "src_main_java_com_spotify_localfiles_mediastoreimpl-mediastoreimpl_properties_lib"}, k = 1, mv = {2, 3, 0}, xi = PlaylistDecorationPolicy.AI_CURATION_REFERENCE_ID_FIELD_NUMBER)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final LocalFilesProperties defaults() {
            return new LocalFilesProperties();
        }

        private Companion() {
        }
    }

    public /* synthetic */ LocalFilesProperties(int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, luk lukVar, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? false : z, (i2 & 4) != 0 ? true : z2, (i2 & 8) != 0 ? true : z3, (i2 & 16) != 0 ? false : z4, (i2 & 32) != 0 ? true : z5, (i2 & 64) != 0 ? false : z6, (i2 & 128) != 0 ? false : z7, lukVar);
    }

    public static final LocalFilesProperties defaults() {
        return INSTANCE.defaults();
    }

    private final LocalFilesProperties getDataProps() {
        return (LocalFilesProperties) this.dataProps.getValue();
    }

    public final int getDurationMin() {
        LocalFilesProperties dataProps = getDataProps();
        return dataProps != null ? dataProps.getDurationMin() : this._durationMin;
    }

    public final boolean getIncludeAlarms() {
        LocalFilesProperties dataProps = getDataProps();
        return dataProps != null ? dataProps.getIncludeAlarms() : this._includeAlarms;
    }

    public final boolean getIncludeAudiobooks() {
        LocalFilesProperties dataProps = getDataProps();
        return dataProps != null ? dataProps.getIncludeAudiobooks() : this._includeAudiobooks;
    }

    public final boolean getIncludeMusic() {
        LocalFilesProperties dataProps = getDataProps();
        return dataProps != null ? dataProps.getIncludeMusic() : this._includeMusic;
    }

    public final boolean getIncludeNotifications() {
        LocalFilesProperties dataProps = getDataProps();
        return dataProps != null ? dataProps.getIncludeNotifications() : this._includeNotifications;
    }

    public final boolean getIncludePodcasts() {
        LocalFilesProperties dataProps = getDataProps();
        return dataProps != null ? dataProps.getIncludePodcasts() : this._includePodcasts;
    }

    public final boolean getIncludeRingtones() {
        LocalFilesProperties dataProps = getDataProps();
        return dataProps != null ? dataProps.getIncludeRingtones() : this._includeRingtones;
    }

    public final boolean getSupportFileUriScheme() {
        LocalFilesProperties dataProps = getDataProps();
        return dataProps != null ? dataProps.getSupportFileUriScheme() : this._supportFileUriScheme;
    }

    @Override // p.pdy0
    public List<fpb> models() {
        return p7h.M(new fpb("duration_min", SCOPE, getDurationMin(), 0, Integer.MAX_VALUE), new fpb("include_alarms", SCOPE, getIncludeAlarms()), new fpb("include_audiobooks", SCOPE, getIncludeAudiobooks()), new fpb("include_music", SCOPE, getIncludeMusic()), new fpb("include_notifications", SCOPE, getIncludeNotifications()), new fpb("include_podcasts", SCOPE, getIncludePodcasts()), new fpb("include_ringtones", SCOPE, getIncludeRingtones()), new fpb("support_file_uri_scheme", SCOPE, getSupportFileUriScheme()));
    }

    public final LocalFilesProperties parse(aey0 parser) {
        return new LocalFilesProperties(parser.b(0, Integer.MAX_VALUE, 0, "local-files:duration_min"), parser.c("local-files:include_alarms", false), parser.c("local-files:include_audiobooks", true), parser.c("local-files:include_music", true), parser.c("local-files:include_notifications", false), parser.c("local-files:include_podcasts", true), parser.c("local-files:include_ringtones", false), parser.c("local-files:support_file_uri_scheme", false));
    }

    /* JADX INFO: renamed from: fromParser, reason: merged with bridge method [inline-methods] */
    public LocalFilesProperties m16fromParser(aey0 parser) {
        return parse(parser);
    }

    public LocalFilesProperties(int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, luk lukVar) {
        this._durationMin = i;
        this._includeAlarms = z;
        this._includeAudiobooks = z2;
        this._includeMusic = z3;
        this._includeNotifications = z4;
        this._includePodcasts = z5;
        this._includeRingtones = z6;
        this._supportFileUriScheme = z7;
        this.configProvider = lukVar;
        this.dataProps = new idd1(new LocalFilesProperties$dataProps$2(this));
    }

    public LocalFilesProperties(luk lukVar) {
        this(0, false, true, true, false, true, false, false, lukVar);
    }

    public LocalFilesProperties() {
        this(0, false, true, true, false, true, false, false, null);
    }

    public /* synthetic */ LocalFilesProperties(int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? false : z, (i2 & 4) != 0 ? true : z2, (i2 & 8) != 0 ? true : z3, (i2 & 16) != 0 ? false : z4, (i2 & 32) != 0 ? true : z5, (i2 & 64) != 0 ? false : z6, (i2 & 128) != 0 ? false : z7);
    }

    public LocalFilesProperties(int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        this(i, z, z2, z3, z4, z5, z6, z7, null);
    }
}
