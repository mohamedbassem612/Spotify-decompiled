package p;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.Bundle;
import androidx.media3.datasource.ContentDataSource$ContentDataSourceException;
import androidx.media3.datasource.DataSourceException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class hsl extends jaa {
    public final ContentResolver e;
    public Uri f;
    public AssetFileDescriptor g;
    public FileInputStream h;
    public long i;
    public boolean t;

    public hsl(Context context) {
        super(false);
        this.e = context.getContentResolver();
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x000e */
    /* JADX WARN: Bottom block not found for handler: all -> 0x004e */
    @Override // p.o2r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void close() {
        /*
            r5 = this;
            r0 = 0
            r5.f = r0
            r1 = 2000(0x7d0, float:2.803E-42)
            r2 = 0
            java.io.FileInputStream r3 = r5.h     // Catch: java.lang.Throwable -> Le java.io.IOException -> L10
            if (r3 == 0) goto L12
            r3.close()     // Catch: java.lang.Throwable -> Le java.io.IOException -> L10
            goto L12
        Le:
            r3 = move-exception
            goto L44
        L10:
            r3 = move-exception
            goto L3e
        L12:
            r5.h = r0
            android.content.res.AssetFileDescriptor r3 = r5.g     // Catch: java.lang.Throwable -> L1c java.io.IOException -> L1e
            if (r3 == 0) goto L20
            r3.close()     // Catch: java.lang.Throwable -> L1c java.io.IOException -> L1e
            goto L20
        L1c:
            r1 = move-exception
            goto L32
        L1e:
            r3 = move-exception
            goto L2c
        L20:
            r5.g = r0
            boolean r0 = r5.t
            if (r0 == 0) goto L2b
            r5.t = r2
            r5.i()
        L2b:
            return
        L2c:
            androidx.media3.datasource.ContentDataSource$ContentDataSourceException r4 = new androidx.media3.datasource.ContentDataSource$ContentDataSourceException     // Catch: java.lang.Throwable -> L1c
            r4.<init>(r3, r1)     // Catch: java.lang.Throwable -> L1c
            throw r4     // Catch: java.lang.Throwable -> L1c
        L32:
            r5.g = r0
            boolean r0 = r5.t
            if (r0 == 0) goto L3d
            r5.t = r2
            r5.i()
        L3d:
            throw r1
        L3e:
            androidx.media3.datasource.ContentDataSource$ContentDataSourceException r4 = new androidx.media3.datasource.ContentDataSource$ContentDataSourceException     // Catch: java.lang.Throwable -> Le
            r4.<init>(r3, r1)     // Catch: java.lang.Throwable -> Le
            throw r4     // Catch: java.lang.Throwable -> Le
        L44:
            r5.h = r0
            android.content.res.AssetFileDescriptor r4 = r5.g     // Catch: java.lang.Throwable -> L4e java.io.IOException -> L50
            if (r4 == 0) goto L52
            r4.close()     // Catch: java.lang.Throwable -> L4e java.io.IOException -> L50
            goto L52
        L4e:
            r1 = move-exception
            goto L64
        L50:
            r3 = move-exception
            goto L5e
        L52:
            r5.g = r0
            boolean r0 = r5.t
            if (r0 == 0) goto L5d
            r5.t = r2
            r5.i()
        L5d:
            throw r3
        L5e:
            androidx.media3.datasource.ContentDataSource$ContentDataSourceException r4 = new androidx.media3.datasource.ContentDataSource$ContentDataSourceException     // Catch: java.lang.Throwable -> L4e
            r4.<init>(r3, r1)     // Catch: java.lang.Throwable -> L4e
            throw r4     // Catch: java.lang.Throwable -> L4e
        L64:
            r5.g = r0
            boolean r0 = r5.t
            if (r0 == 0) goto L6f
            r5.t = r2
            r5.i()
        L6f:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p.hsl.close():void");
    }

    @Override // p.o2r
    public final Uri getUri() {
        return this.f;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.media3.datasource.DataSourceException */
    public final int read(byte[] bArr, int i, int i2) throws DataSourceException {
        if (i2 == 0) {
            return 0;
        }
        long j = this.i;
        if (j != 0) {
            if (j != -1) {
                try {
                    i2 = (int) Math.min(j, i2);
                } catch (IOException e) {
                    throw new ContentDataSource$ContentDataSourceException(e, 2000);
                }
            }
            FileInputStream fileInputStream = this.h;
            String str = zoi1.a;
            int i3 = fileInputStream.read(bArr, i, i2);
            if (i3 != -1) {
                long j2 = this.i;
                if (j2 != -1) {
                    this.i = j2 - ((long) i3);
                }
                c(i3);
                return i3;
            }
        }
        return -1;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.media3.datasource.DataSourceException */
    @Override // p.o2r
    public final long t(n3r n3rVar) throws DataSourceException {
        int i;
        AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor;
        long jPosition;
        try {
            try {
                Uri uri = n3rVar.a;
                long j = n3rVar.g;
                long j2 = n3rVar.f;
                Uri uriNormalizeScheme = uri.normalizeScheme();
                this.f = uriNormalizeScheme;
                l(n3rVar);
                boolean zEquals = Objects.equals(uriNormalizeScheme.getScheme(), "content");
                ContentResolver contentResolver = this.e;
                if (zEquals) {
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("android.provider.extra.ACCEPT_ORIGINAL_MEDIA_FORMAT", true);
                    assetFileDescriptorOpenAssetFileDescriptor = contentResolver.openTypedAssetFileDescriptor(uriNormalizeScheme, "*/*", bundle);
                } else {
                    assetFileDescriptorOpenAssetFileDescriptor = contentResolver.openAssetFileDescriptor(uriNormalizeScheme, "r");
                }
                this.g = assetFileDescriptorOpenAssetFileDescriptor;
                if (assetFileDescriptorOpenAssetFileDescriptor == null) {
                    i = 2000;
                    try {
                        throw new ContentDataSource$ContentDataSourceException(new IOException("Could not open file descriptor for: " + uriNormalizeScheme), 2000);
                    } catch (IOException e) {
                        e = e;
                        throw new ContentDataSource$ContentDataSourceException(e, e instanceof FileNotFoundException ? 2005 : i);
                    }
                }
                long length = assetFileDescriptorOpenAssetFileDescriptor.getLength();
                FileInputStream fileInputStream = new FileInputStream(assetFileDescriptorOpenAssetFileDescriptor.getFileDescriptor());
                this.h = fileInputStream;
                if (length != -1 && j2 > length) {
                    throw new ContentDataSource$ContentDataSourceException(null, 2008);
                }
                long startOffset = assetFileDescriptorOpenAssetFileDescriptor.getStartOffset();
                long jSkip = fileInputStream.skip(startOffset + j2) - startOffset;
                if (jSkip != j2) {
                    throw new ContentDataSource$ContentDataSourceException(null, 2008);
                }
                if (length == -1) {
                    FileChannel channel = fileInputStream.getChannel();
                    long size = channel.size();
                    if (size == 0) {
                        this.i = -1L;
                        jPosition = -1;
                    } else {
                        jPosition = size - channel.position();
                        this.i = jPosition;
                        if (jPosition < 0) {
                            throw new ContentDataSource$ContentDataSourceException(null, 2008);
                        }
                    }
                } else {
                    jPosition = length - jSkip;
                    this.i = jPosition;
                    if (jPosition < 0) {
                        throw new ContentDataSource$ContentDataSourceException(null, 2008);
                    }
                }
                if (j != -1) {
                    this.i = jPosition == -1 ? j : Math.min(jPosition, j);
                }
                this.t = true;
                m(n3rVar);
                return j != -1 ? j : this.i;
            } catch (IOException e2) {
                e = e2;
                i = 2000;
            }
        } catch (ContentDataSource$ContentDataSourceException e3) {
            throw e3;
        }
    }
}
