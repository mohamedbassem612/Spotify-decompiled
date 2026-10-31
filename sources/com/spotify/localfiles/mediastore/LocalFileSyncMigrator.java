package com.spotify.localfiles.mediastore;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.provider.MediaStore;
import com.spotify.playlist.policy.proto.PlaylistDecorationPolicy;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Date;
import kotlin.Metadata;
import p.f4i1;
import p.ihc1;
import p.l1d;
import p.o0c;
import p.u890;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J>\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\fR\u0016\u0010\u0006\u001a\n \b*\u0004\u0018\u00010\u00070\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\n \b*\u0004\u0018\u00010\n0\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/spotify/localfiles/mediastore/LocalFileSyncMigrator;", "", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "resolver", "Landroid/content/ContentResolver;", "kotlin.jvm.PlatformType", "audioCollection", "Landroid/net/Uri;", "copyFile", "", "srcPath", "title", "artist", "album", "duration", "", "displayName", "relativePathPrefix", "src_main_java_com_spotify_localfiles_mediastore-mediastore"}, k = 1, mv = {2, 3, 0}, xi = PlaylistDecorationPolicy.AI_CURATION_REFERENCE_ID_FIELD_NUMBER)
public final class LocalFileSyncMigrator {
    private final Uri audioCollection;
    private final ContentResolver resolver;

    public LocalFileSyncMigrator(Context context) {
        this.resolver = context.getContentResolver();
        this.audioCollection = Build.VERSION.SDK_INT >= 29 ? MediaStore.Audio.Media.getContentUri("external_primary") : MediaStore.Audio.Media.EXTERNAL_CONTENT_URI;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x008a  */
    public final String copyFile(String srcPath, String title, String artist, String album, int duration, String displayName, String relativePathPrefix) {
        String str;
        boolean zMoveToFirst;
        String strM;
        File parentFile;
        String strE = f4i1.e(ihc1.g1(relativePathPrefix, '/'), "/");
        if (Build.VERSION.SDK_INT < 29) {
            str = Environment.getExternalStorageDirectory().getAbsolutePath() + "/" + strE + displayName;
        } else {
            str = null;
        }
        ContentResolver contentResolver = this.resolver;
        try {
            if (str != null) {
                Cursor cursorQuery = contentResolver.query(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, new String[0], "_data=?", new String[]{str}, null);
                if (cursorQuery != null) {
                    try {
                        zMoveToFirst = cursorQuery.moveToFirst();
                        cursorQuery.close();
                    } catch (Throwable th) {
                        try {
                            throw th;
                        } catch (Throwable th2) {
                            u890.p(cursorQuery, th);
                            throw th2;
                        }
                    }
                } else {
                    zMoveToFirst = false;
                }
            } else {
                Cursor cursorQuery2 = contentResolver.query(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, new String[0], "relative_path=? AND _display_name=?", new String[]{strE, displayName}, null);
                if (cursorQuery2 != null) {
                    try {
                        zMoveToFirst = cursorQuery2.moveToFirst();
                        cursorQuery2.close();
                    } catch (Throwable th3) {
                        try {
                            throw th3;
                        } catch (Throwable th4) {
                            u890.p(cursorQuery2, th3);
                            throw th4;
                        }
                    }
                } else {
                    zMoveToFirst = false;
                }
            }
        } catch (Exception unused) {
        }
        if (zMoveToFirst) {
            return "";
        }
        if (str != null && (parentFile = new File(str).getParentFile()) != null) {
            parentFile.mkdirs();
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("title", title);
        contentValues.put("artist", artist);
        contentValues.put("album", album);
        contentValues.put("duration", Integer.valueOf(duration * 1000));
        contentValues.put("mime_type", LocalFileSyncMigratorKt.access$audioMimeType(displayName));
        contentValues.put("_display_name", displayName);
        if (str != null) {
            contentValues.put("_data", str);
        } else {
            contentValues.put("relative_path", strE);
            contentValues.put("is_pending", (Integer) 1);
            contentValues.put("date_expires", Long.valueOf(new Date().getTime() + 3600000));
        }
        try {
            Uri uriInsert = this.resolver.insert(this.audioCollection, contentValues);
            if (uriInsert == null) {
                return "ERR_INSERT";
            }
            try {
                OutputStream outputStreamOpenOutputStream = this.resolver.openOutputStream(uriInsert);
                if (outputStreamOpenOutputStream == null) {
                    strM = "ERR_OUTSTREAM";
                } else {
                    try {
                        FileInputStream fileInputStream = new FileInputStream(srcPath);
                        try {
                            o0c.w(fileInputStream, outputStreamOpenOutputStream);
                            fileInputStream.close();
                            outputStreamOpenOutputStream.close();
                            strM = null;
                        } catch (Throwable th5) {
                            try {
                                throw th5;
                            } catch (Throwable th6) {
                                u890.p(fileInputStream, th5);
                                throw th6;
                            }
                        }
                    } catch (Throwable th7) {
                        try {
                            throw th7;
                        } catch (Throwable th8) {
                            u890.p(outputStreamOpenOutputStream, th7);
                            throw th8;
                        }
                    }
                }
            } catch (FileNotFoundException e) {
                strM = l1d.m("ERR_FILE_NOT_FOUND_", e.getMessage());
            } catch (IOException e2) {
                strM = l1d.m("ERR_COPY_", e2.getMessage());
            } catch (RuntimeException e3) {
                strM = l1d.m("ERR_OUTSTREAM_", e3.getMessage());
            }
            if (strM != null) {
                try {
                    this.resolver.delete(uriInsert, null, null);
                } catch (RuntimeException unused2) {
                }
                return strM;
            }
            try {
                new File(srcPath).delete();
            } catch (Exception unused3) {
            }
            if (str != null) {
                return "";
            }
            contentValues.clear();
            contentValues.put("is_pending", (Integer) 0);
            try {
                this.resolver.update(uriInsert, contentValues, null, null);
                return "";
            } catch (RuntimeException e4) {
                return l1d.m("ERR_UPDATE_", e4.getMessage());
            }
        } catch (RuntimeException e5) {
            return l1d.m("ERR_INSERT_", e5.getMessage());
        }
    }
}
