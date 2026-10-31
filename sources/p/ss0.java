package p;

import androidx.work.impl.WorkDatabase_Impl;
import com.ravelin.core.repository.broadcastsdb.BroadcastsDatabase_Impl;
import com.spotify.adonappopen.repository.storage.AdOnAppOpenDatabase_Impl;
import com.spotify.betamax.offline.database.BetamaxOfflineDatabase_Impl;
import com.spotify.connect.devicessortingimpl.data.DevicePickerSortingDatabase_Impl;
import com.spotify.eventsender.eventsender.EventSenderDatabase_Impl;
import com.spotify.listuxplatformconsumers.likedsongs.shared.filtertagsdata.FilterTagsDatabase_Impl;
import com.spotify.liveevents.recentlocationsimpl.db.RecentLocationsDatabase_Impl;
import com.spotify.lyrics.offlineimpl.database.LyricsDatabase_Impl;
import com.spotify.mediabrowserservice.allowlistpackagevalidator.denylist.cache.db.DenylistDatabase_Impl;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdkimpl.data.cache.room.MessagesDatabase_Impl;
import com.spotify.puffin.core.data.filtermetadata.database.FilterMetadataDatabase_Impl;
import com.spotify.puffin.core.data.headphonefilterstate.database.HeadphoneFilterStateDatabase_Impl;
import com.spotify.search.historyroom.db.HistoryDatabase_Impl;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class ss0 extends dyb0 {
    public final /* synthetic */ byte d = 13;
    public final /* synthetic */ en31 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ss0(WorkDatabase_Impl workDatabase_Impl) {
        super(24, "08b926448d86528e697981ddd30459f7", "149fd8ad55885d3fe3549a37a0163243");
        this.e = workDatabase_Impl;
    }

    private final nql a0(y341 y341Var) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("headphoneIdentifier", new mkd1(1, 1, "headphoneIdentifier", "TEXT", (String) null, true));
        linkedHashMap.put("owner", new mkd1(2, 1, "owner", "TEXT", (String) null, true));
        linkedHashMap.put("headphoneName", new mkd1(0, 1, "headphoneName", "TEXT", (String) null, true));
        linkedHashMap.put("externalizationEnabledId", new mkd1(0, 1, "externalizationEnabledId", "TEXT", (String) null, true));
        linkedHashMap.put("externalizationDisabledId", new mkd1(0, 1, "externalizationDisabledId", "TEXT", (String) null, true));
        linkedHashMap.put("externalizationEnabled", new mkd1(0, 1, "externalizationEnabled", "INTEGER", (String) null, true));
        linkedHashMap.put("specificEnabledId", new mkd1(0, 1, "specificEnabledId", "TEXT", (String) null, false));
        linkedHashMap.put("specificDisabledId", new mkd1(0, 1, "specificDisabledId", "TEXT", (String) null, true));
        linkedHashMap.put("specificEnabled", new mkd1(0, 1, "specificEnabled", "INTEGER", (String) null, true));
        pkd1 pkd1Var = new pkd1("BluetoothHeadphoneFilterStateEntity", linkedHashMap, xvj1.p(linkedHashMap, "filterName", new mkd1(0, 1, "filterName", "TEXT", (String) null, false)), new LinkedHashSet());
        pkd1 pkd1VarB = syo1.B(y341Var, "BluetoothHeadphoneFilterStateEntity");
        if (!pkd1Var.equals(pkd1VarB)) {
            return new nql(false, xvj1.k("BluetoothHeadphoneFilterStateEntity(com.spotify.puffin.core.data.headphonefilterstate.database.BluetoothHeadphoneFilterStateEntity).\n Expected:\n", pkd1Var, "\n Found:\n", pkd1VarB));
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        linkedHashMap2.put("headphoneIdentifier", new mkd1(1, 1, "headphoneIdentifier", "TEXT", (String) null, true));
        linkedHashMap2.put("owner", new mkd1(2, 1, "owner", "TEXT", (String) null, true));
        linkedHashMap2.put("externalizationEnabledId", new mkd1(0, 1, "externalizationEnabledId", "TEXT", (String) null, true));
        linkedHashMap2.put("externalizationDisabledId", new mkd1(0, 1, "externalizationDisabledId", "TEXT", (String) null, true));
        linkedHashMap2.put("externalizationEnabled", new mkd1(0, 1, "externalizationEnabled", "INTEGER", (String) null, true));
        linkedHashMap2.put("specificEnabledId", new mkd1(0, 1, "specificEnabledId", "TEXT", (String) null, false));
        linkedHashMap2.put("specificDisabledId", new mkd1(0, 1, "specificDisabledId", "TEXT", (String) null, true));
        linkedHashMap2.put("specificEnabled", new mkd1(0, 1, "specificEnabled", "INTEGER", (String) null, true));
        pkd1 pkd1Var2 = new pkd1("WiredHeadphoneFilterStateEntity", linkedHashMap2, xvj1.p(linkedHashMap2, "filterName", new mkd1(0, 1, "filterName", "TEXT", (String) null, false)), new LinkedHashSet());
        pkd1 pkd1VarB2 = syo1.B(y341Var, "WiredHeadphoneFilterStateEntity");
        return !pkd1Var2.equals(pkd1VarB2) ? new nql(false, xvj1.k("WiredHeadphoneFilterStateEntity(com.spotify.puffin.core.data.headphonefilterstate.database.WiredHeadphoneFilterStateEntity).\n Expected:\n", pkd1Var2, "\n Found:\n", pkd1VarB2)) : new nql(true, (String) null);
    }

    private final nql b0(y341 y341Var) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("uri", new mkd1(1, 1, "uri", "TEXT", (String) null, true));
        linkedHashMap.put("title", new mkd1(0, 1, "title", "TEXT", (String) null, true));
        linkedHashMap.put("subtitle", new mkd1(0, 1, "subtitle", "TEXT", (String) null, false));
        linkedHashMap.put("image_uri", new mkd1(0, 1, "image_uri", "TEXT", (String) null, false));
        linkedHashMap.put("video_image_uri", new mkd1(0, 1, "video_image_uri", "TEXT", (String) null, false));
        linkedHashMap.put("type", new mkd1(0, 1, "type", "TEXT", (String) null, true));
        linkedHashMap.put("explicit", new mkd1(0, 1, "explicit", "INTEGER", (String) null, false));
        linkedHashMap.put("preview_id", new mkd1(0, 1, "preview_id", "TEXT", (String) null, false));
        linkedHashMap.put("mogef19", new mkd1(0, 1, "mogef19", "INTEGER", (String) null, false));
        linkedHashMap.put("disabled", new mkd1(0, 1, "disabled", "INTEGER", (String) null, false));
        linkedHashMap.put("artist_uris", new mkd1(0, 1, "artist_uris", "TEXT", (String) null, false));
        linkedHashMap.put("timestamp", new mkd1(0, 1, "timestamp", "INTEGER", (String) null, true));
        linkedHashMap.put("has_video", new mkd1(0, 1, "has_video", "INTEGER", (String) null, false));
        pkd1 pkd1Var = new pkd1("history", linkedHashMap, xvj1.p(linkedHashMap, "is_verified", new mkd1(0, 1, "is_verified", "INTEGER", (String) null, false)), new LinkedHashSet());
        pkd1 pkd1VarB = syo1.B(y341Var, "history");
        return !pkd1Var.equals(pkd1VarB) ? new nql(false, xvj1.k("history(com.spotify.search.historyroom.db.entities.HistoryItemEntity).\n Expected:\n", pkd1Var, "\n Found:\n", pkd1VarB)) : new nql(true, (String) null);
    }

    private final nql c0(y341 y341Var) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("track_id", new mkd1(1, 1, "track_id", "TEXT", (String) null, true));
        linkedHashMap.put("lines", new mkd1(0, 1, "lines", "TEXT", (String) null, true));
        linkedHashMap.put("syncStatus", new mkd1(0, 1, "syncStatus", "TEXT", (String) null, true));
        linkedHashMap.put("translations", new mkd1(0, 1, "translations", "TEXT", (String) null, true));
        linkedHashMap.put("language", new mkd1(0, 1, "language", "TEXT", (String) null, true));
        linkedHashMap.put("isRTL", new mkd1(0, 1, "isRTL", "INTEGER", (String) null, true));
        linkedHashMap.put("provider", new mkd1(0, 1, "provider", "TEXT", (String) null, true));
        linkedHashMap.put("colors", new mkd1(0, 1, "colors", "TEXT", (String) null, true));
        pkd1 pkd1Var = new pkd1("lyrics_entities", linkedHashMap, xvj1.p(linkedHashMap, "vocalRemovalStatus", new mkd1(0, 1, "vocalRemovalStatus", "TEXT", (String) null, true)), new LinkedHashSet());
        pkd1 pkd1VarB = syo1.B(y341Var, "lyrics_entities");
        return !pkd1Var.equals(pkd1VarB) ? new nql(false, xvj1.k("lyrics_entities(com.spotify.lyrics.offlineimpl.database.LyricsDatabaseEntity).\n Expected:\n", pkd1Var, "\n Found:\n", pkd1VarB)) : new nql(true, (String) null);
    }

    private final nql d0(y341 y341Var) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("geoNameId", new mkd1(1, 1, "geoNameId", "INTEGER", (String) null, true));
        linkedHashMap.put("city", new mkd1(0, 1, "city", "TEXT", (String) null, true));
        pkd1 pkd1Var = new pkd1("recent_locations", linkedHashMap, xvj1.p(linkedHashMap, "timestamp", new mkd1(0, 1, "timestamp", "INTEGER", (String) null, true)), new LinkedHashSet());
        pkd1 pkd1VarB = syo1.B(y341Var, "recent_locations");
        return !pkd1Var.equals(pkd1VarB) ? new nql(false, xvj1.k("recent_locations(com.spotify.liveevents.recentlocationsimpl.db.entities.RecentLocationEntity).\n Expected:\n", pkd1Var, "\n Found:\n", pkd1VarB)) : new nql(true, (String) null);
    }

    @Override // p.dyb0
    public final void a(y341 y341Var) {
        switch (this.d) {
            case 0:
                qxy0.s(y341Var, "CREATE TABLE IF NOT EXISTS `AdOnAppOpenEntity` (`id` INTEGER NOT NULL, `isShown` INTEGER NOT NULL, `expiresAt` INTEGER NOT NULL, PRIMARY KEY(`id`))");
                qxy0.s(y341Var, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                qxy0.s(y341Var, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '106ce4a6cfbfc04cb25a6859bdb67a32')");
                break;
            case 1:
                qxy0.s(y341Var, "CREATE TABLE IF NOT EXISTS `OfflineLicenseInfoEntity` (`media_id` TEXT NOT NULL, `key_set_id` TEXT NOT NULL, PRIMARY KEY(`media_id`))");
                qxy0.s(y341Var, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                qxy0.s(y341Var, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'c68c2249dd78211e654e1cab770c092a')");
                break;
            case 2:
                qxy0.s(y341Var, "CREATE TABLE IF NOT EXISTS `device_broadcasts` (`id` INTEGER, `from` TEXT, `deviceId` TEXT, `createdAt` INTEGER, PRIMARY KEY(`id`))");
                qxy0.s(y341Var, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                qxy0.s(y341Var, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '1d606c2b4db3d84a5744e2cdfb443d5c')");
                break;
            case 3:
                qxy0.s(y341Var, "CREATE TABLE IF NOT EXISTS `cachedDenylist` (`package_names` TEXT NOT NULL, `app_signatures` TEXT NOT NULL, `timestamp` INTEGER NOT NULL, PRIMARY KEY(`timestamp`))");
                qxy0.s(y341Var, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                qxy0.s(y341Var, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'd67ac72aa4a8cece7aedacad51645ca8')");
                break;
            case 4:
                qxy0.s(y341Var, "CREATE TABLE IF NOT EXISTS `DeviceLastConnection` (`deviceIdentifier` TEXT NOT NULL, `timestamp` INTEGER NOT NULL, PRIMARY KEY(`deviceIdentifier`))");
                qxy0.s(y341Var, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                qxy0.s(y341Var, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '914d67f6f529727de34d02b66c756daf')");
                break;
            case 5:
                qxy0.s(y341Var, "CREATE TABLE IF NOT EXISTS `Events` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `authenticated` INTEGER, `eventName` TEXT, `sequenceId` BLOB, `sequenceNumber` INTEGER NOT NULL, `fragments` BLOB, `owner` TEXT, `deviceId` TEXT)");
                qxy0.s(y341Var, "CREATE INDEX IF NOT EXISTS `index_Events_eventName` ON `Events` (`eventName`)");
                qxy0.s(y341Var, "CREATE TABLE IF NOT EXISTS `EventSequenceNumbers` (`eventName` TEXT NOT NULL, `sequenceId` BLOB NOT NULL, `sequenceNumberNext` INTEGER NOT NULL, PRIMARY KEY(`eventName`, `sequenceId`))");
                qxy0.s(y341Var, "CREATE TABLE IF NOT EXISTS `RateLimitedEvents` (`eventName` TEXT NOT NULL, `count` INTEGER NOT NULL, `timestamp` INTEGER NOT NULL, PRIMARY KEY(`eventName`))");
                qxy0.s(y341Var, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                qxy0.s(y341Var, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'c6ffea087c1eb57023f5bbcc2c41e2ce')");
                break;
            case 6:
                qxy0.s(y341Var, "CREATE TABLE IF NOT EXISTS `ExternalizationEnabledFilterEntity` (`id` TEXT NOT NULL, `paths` TEXT NOT NULL, `revision` INTEGER NOT NULL, `format` INTEGER NOT NULL, PRIMARY KEY(`id`))");
                qxy0.s(y341Var, "CREATE TABLE IF NOT EXISTS `ExternalizationDisabledFilterEntity` (`id` TEXT NOT NULL, `paths` TEXT NOT NULL, `revision` INTEGER NOT NULL, `format` INTEGER NOT NULL, PRIMARY KEY(`id`))");
                qxy0.s(y341Var, "CREATE TABLE IF NOT EXISTS `SpecificEnabledFilterEntity` (`id` TEXT NOT NULL, `paths` TEXT NOT NULL, `brand` TEXT NOT NULL, `model` TEXT NOT NULL, `deviceFormattedName` TEXT NOT NULL, `revision` INTEGER NOT NULL, `format` INTEGER NOT NULL, PRIMARY KEY(`id`))");
                qxy0.s(y341Var, "CREATE TABLE IF NOT EXISTS `SpecificDisabledFilterEntity` (`id` TEXT NOT NULL, `paths` TEXT NOT NULL, `revision` INTEGER NOT NULL, `format` INTEGER NOT NULL, PRIMARY KEY(`id`))");
                qxy0.s(y341Var, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                qxy0.s(y341Var, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '9626ba88a5701636a14778c5d67830e5')");
                break;
            case 7:
                qxy0.s(y341Var, "CREATE TABLE IF NOT EXISTS `liked_songs_filter_tags_entity` (`id` TEXT NOT NULL, `title` TEXT NOT NULL, `position` INTEGER NOT NULL, `isSelected` INTEGER NOT NULL, PRIMARY KEY(`id`))");
                qxy0.s(y341Var, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                qxy0.s(y341Var, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '0c3ff92392f1da458f90ce11b6d17155')");
                break;
            case 8:
                qxy0.s(y341Var, "CREATE TABLE IF NOT EXISTS `BluetoothHeadphoneFilterStateEntity` (`headphoneIdentifier` TEXT NOT NULL, `owner` TEXT NOT NULL, `headphoneName` TEXT NOT NULL, `externalizationEnabledId` TEXT NOT NULL, `externalizationDisabledId` TEXT NOT NULL, `externalizationEnabled` INTEGER NOT NULL, `specificEnabledId` TEXT, `specificDisabledId` TEXT NOT NULL, `specificEnabled` INTEGER NOT NULL, `filterName` TEXT, PRIMARY KEY(`headphoneIdentifier`, `owner`))");
                qxy0.s(y341Var, "CREATE TABLE IF NOT EXISTS `WiredHeadphoneFilterStateEntity` (`headphoneIdentifier` TEXT NOT NULL, `owner` TEXT NOT NULL, `externalizationEnabledId` TEXT NOT NULL, `externalizationDisabledId` TEXT NOT NULL, `externalizationEnabled` INTEGER NOT NULL, `specificEnabledId` TEXT, `specificDisabledId` TEXT NOT NULL, `specificEnabled` INTEGER NOT NULL, `filterName` TEXT, PRIMARY KEY(`headphoneIdentifier`, `owner`))");
                qxy0.s(y341Var, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                qxy0.s(y341Var, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '599a4d2e3a4ade6df569e65f3f00ce91')");
                break;
            case 9:
                qxy0.s(y341Var, "CREATE TABLE IF NOT EXISTS `history` (`uri` TEXT NOT NULL, `title` TEXT NOT NULL, `subtitle` TEXT, `image_uri` TEXT, `video_image_uri` TEXT, `type` TEXT NOT NULL, `explicit` INTEGER, `preview_id` TEXT, `mogef19` INTEGER, `disabled` INTEGER, `artist_uris` TEXT, `timestamp` INTEGER NOT NULL, `has_video` INTEGER, `is_verified` INTEGER, PRIMARY KEY(`uri`))");
                qxy0.s(y341Var, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                qxy0.s(y341Var, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '5c6117641afdcc11643f1fe5464500c1')");
                break;
            case 10:
                qxy0.s(y341Var, "CREATE TABLE IF NOT EXISTS `lyrics_entities` (`track_id` TEXT NOT NULL, `lines` TEXT NOT NULL, `syncStatus` TEXT NOT NULL, `translations` TEXT NOT NULL, `language` TEXT NOT NULL, `isRTL` INTEGER NOT NULL, `provider` TEXT NOT NULL, `colors` TEXT NOT NULL, `vocalRemovalStatus` TEXT NOT NULL, PRIMARY KEY(`track_id`))");
                qxy0.s(y341Var, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                qxy0.s(y341Var, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '83ba4b521ff031f5afee46484a2872a2')");
                break;
            case 11:
                qxy0.s(y341Var, "CREATE TABLE IF NOT EXISTS `messages` (`trigger` TEXT NOT NULL, `messageId` INTEGER NOT NULL, `message` BLOB, PRIMARY KEY(`trigger`, `messageId`))");
                qxy0.s(y341Var, "CREATE TABLE IF NOT EXISTS `message_id_and_capping` (`messageKey` TEXT NOT NULL, `capping` BLOB, PRIMARY KEY(`messageKey`))");
                qxy0.s(y341Var, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                qxy0.s(y341Var, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '067516dddca80bf1e21a8b3464f03d6c')");
                break;
            case 12:
                qxy0.s(y341Var, "CREATE TABLE IF NOT EXISTS `recent_locations` (`geoNameId` INTEGER NOT NULL, `city` TEXT NOT NULL, `timestamp` INTEGER NOT NULL, PRIMARY KEY(`geoNameId`))");
                qxy0.s(y341Var, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                qxy0.s(y341Var, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'bbf535ccb3ed5f2bcd07c8331dbb6312')");
                break;
            default:
                qxy0.s(y341Var, "CREATE TABLE IF NOT EXISTS `Dependency` (`work_spec_id` TEXT NOT NULL, `prerequisite_id` TEXT NOT NULL, PRIMARY KEY(`work_spec_id`, `prerequisite_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE , FOREIGN KEY(`prerequisite_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
                qxy0.s(y341Var, "CREATE INDEX IF NOT EXISTS `index_Dependency_work_spec_id` ON `Dependency` (`work_spec_id`)");
                qxy0.s(y341Var, "CREATE INDEX IF NOT EXISTS `index_Dependency_prerequisite_id` ON `Dependency` (`prerequisite_id`)");
                qxy0.s(y341Var, "CREATE TABLE IF NOT EXISTS `WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT NOT NULL, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `last_enqueue_time` INTEGER NOT NULL DEFAULT -1, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `run_in_foreground` INTEGER NOT NULL, `out_of_quota_policy` INTEGER NOT NULL, `period_count` INTEGER NOT NULL DEFAULT 0, `generation` INTEGER NOT NULL DEFAULT 0, `next_schedule_time_override` INTEGER NOT NULL DEFAULT 9223372036854775807, `next_schedule_time_override_generation` INTEGER NOT NULL DEFAULT 0, `stop_reason` INTEGER NOT NULL DEFAULT -256, `trace_tag` TEXT, `backoff_on_system_interruptions` INTEGER, `required_network_type` INTEGER NOT NULL, `required_network_request` BLOB NOT NULL DEFAULT x'', `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB NOT NULL, PRIMARY KEY(`id`))");
                qxy0.s(y341Var, "CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)");
                qxy0.s(y341Var, "CREATE INDEX IF NOT EXISTS `index_WorkSpec_last_enqueue_time` ON `WorkSpec` (`last_enqueue_time`)");
                qxy0.s(y341Var, "CREATE TABLE IF NOT EXISTS `WorkTag` (`tag` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`tag`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
                qxy0.s(y341Var, "CREATE INDEX IF NOT EXISTS `index_WorkTag_work_spec_id` ON `WorkTag` (`work_spec_id`)");
                qxy0.s(y341Var, "CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `generation` INTEGER NOT NULL DEFAULT 0, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`, `generation`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
                qxy0.s(y341Var, "CREATE TABLE IF NOT EXISTS `WorkName` (`name` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`name`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
                qxy0.s(y341Var, "CREATE INDEX IF NOT EXISTS `index_WorkName_work_spec_id` ON `WorkName` (`work_spec_id`)");
                qxy0.s(y341Var, "CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress` BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
                qxy0.s(y341Var, "CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
                qxy0.s(y341Var, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                qxy0.s(y341Var, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '08b926448d86528e697981ddd30459f7')");
                break;
        }
    }

    @Override // p.dyb0
    public final void c(y341 y341Var) {
        switch (this.d) {
            case 0:
                qxy0.s(y341Var, "DROP TABLE IF EXISTS `AdOnAppOpenEntity`");
                break;
            case 1:
                qxy0.s(y341Var, "DROP TABLE IF EXISTS `OfflineLicenseInfoEntity`");
                break;
            case 2:
                qxy0.s(y341Var, "DROP TABLE IF EXISTS `device_broadcasts`");
                break;
            case 3:
                qxy0.s(y341Var, "DROP TABLE IF EXISTS `cachedDenylist`");
                break;
            case 4:
                qxy0.s(y341Var, "DROP TABLE IF EXISTS `DeviceLastConnection`");
                break;
            case 5:
                qxy0.s(y341Var, "DROP TABLE IF EXISTS `Events`");
                qxy0.s(y341Var, "DROP TABLE IF EXISTS `EventSequenceNumbers`");
                qxy0.s(y341Var, "DROP TABLE IF EXISTS `RateLimitedEvents`");
                break;
            case 6:
                qxy0.s(y341Var, "DROP TABLE IF EXISTS `ExternalizationEnabledFilterEntity`");
                qxy0.s(y341Var, "DROP TABLE IF EXISTS `ExternalizationDisabledFilterEntity`");
                qxy0.s(y341Var, "DROP TABLE IF EXISTS `SpecificEnabledFilterEntity`");
                qxy0.s(y341Var, "DROP TABLE IF EXISTS `SpecificDisabledFilterEntity`");
                break;
            case 7:
                qxy0.s(y341Var, "DROP TABLE IF EXISTS `liked_songs_filter_tags_entity`");
                break;
            case 8:
                qxy0.s(y341Var, "DROP TABLE IF EXISTS `BluetoothHeadphoneFilterStateEntity`");
                qxy0.s(y341Var, "DROP TABLE IF EXISTS `WiredHeadphoneFilterStateEntity`");
                break;
            case 9:
                qxy0.s(y341Var, "DROP TABLE IF EXISTS `history`");
                break;
            case 10:
                qxy0.s(y341Var, "DROP TABLE IF EXISTS `lyrics_entities`");
                break;
            case 11:
                qxy0.s(y341Var, "DROP TABLE IF EXISTS `messages`");
                qxy0.s(y341Var, "DROP TABLE IF EXISTS `message_id_and_capping`");
                break;
            case 12:
                qxy0.s(y341Var, "DROP TABLE IF EXISTS `recent_locations`");
                break;
            default:
                qxy0.s(y341Var, "DROP TABLE IF EXISTS `Dependency`");
                qxy0.s(y341Var, "DROP TABLE IF EXISTS `WorkSpec`");
                qxy0.s(y341Var, "DROP TABLE IF EXISTS `WorkTag`");
                qxy0.s(y341Var, "DROP TABLE IF EXISTS `SystemIdInfo`");
                qxy0.s(y341Var, "DROP TABLE IF EXISTS `WorkName`");
                qxy0.s(y341Var, "DROP TABLE IF EXISTS `WorkProgress`");
                qxy0.s(y341Var, "DROP TABLE IF EXISTS `Preference`");
                break;
        }
    }

    @Override // p.dyb0
    public final void s() {
        byte b = this.d;
    }

    @Override // p.dyb0
    public final void u(y341 y341Var) {
        byte b = this.d;
        WorkDatabase_Impl workDatabase_Impl = this.e;
        switch (b) {
            case 0:
                ((AdOnAppOpenDatabase_Impl) workDatabase_Impl).p(y341Var);
                break;
            case 1:
                ((BetamaxOfflineDatabase_Impl) workDatabase_Impl).p(y341Var);
                break;
            case 2:
                ((BroadcastsDatabase_Impl) workDatabase_Impl).p(y341Var);
                break;
            case 3:
                ((DenylistDatabase_Impl) workDatabase_Impl).p(y341Var);
                break;
            case 4:
                ((DevicePickerSortingDatabase_Impl) workDatabase_Impl).p(y341Var);
                break;
            case 5:
                ((EventSenderDatabase_Impl) workDatabase_Impl).p(y341Var);
                break;
            case 6:
                ((FilterMetadataDatabase_Impl) workDatabase_Impl).p(y341Var);
                break;
            case 7:
                ((FilterTagsDatabase_Impl) workDatabase_Impl).p(y341Var);
                break;
            case 8:
                ((HeadphoneFilterStateDatabase_Impl) workDatabase_Impl).p(y341Var);
                break;
            case 9:
                ((HistoryDatabase_Impl) workDatabase_Impl).p(y341Var);
                break;
            case 10:
                ((LyricsDatabase_Impl) workDatabase_Impl).p(y341Var);
                break;
            case 11:
                ((MessagesDatabase_Impl) workDatabase_Impl).p(y341Var);
                break;
            case 12:
                ((RecentLocationsDatabase_Impl) workDatabase_Impl).p(y341Var);
                break;
            default:
                qxy0.s(y341Var, "PRAGMA foreign_keys = ON");
                workDatabase_Impl.p(y341Var);
                break;
        }
    }

    @Override // p.dyb0
    public final void v() {
        byte b = this.d;
    }

    @Override // p.dyb0
    public final void w(y341 y341Var) {
        switch (this.d) {
            case 0:
                nyo1.j(y341Var);
                break;
            case 1:
                nyo1.j(y341Var);
                break;
            case 2:
                nyo1.j(y341Var);
                break;
            case 3:
                nyo1.j(y341Var);
                break;
            case 4:
                nyo1.j(y341Var);
                break;
            case 5:
                nyo1.j(y341Var);
                break;
            case 6:
                nyo1.j(y341Var);
                break;
            case 7:
                nyo1.j(y341Var);
                break;
            case 8:
                nyo1.j(y341Var);
                break;
            case 9:
                nyo1.j(y341Var);
                break;
            case 10:
                nyo1.j(y341Var);
                break;
            case 11:
                nyo1.j(y341Var);
                break;
            case 12:
                nyo1.j(y341Var);
                break;
            default:
                nyo1.j(y341Var);
                break;
        }
    }

    @Override // p.dyb0
    public final nql x(y341 y341Var) {
        switch (this.d) {
            case 0:
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("id", new mkd1(1, 1, "id", "INTEGER", (String) null, true));
                linkedHashMap.put("isShown", new mkd1(0, 1, "isShown", "INTEGER", (String) null, true));
                pkd1 pkd1Var = new pkd1("AdOnAppOpenEntity", linkedHashMap, xvj1.p(linkedHashMap, "expiresAt", new mkd1(0, 1, "expiresAt", "INTEGER", (String) null, true)), new LinkedHashSet());
                pkd1 pkd1VarB = syo1.B(y341Var, "AdOnAppOpenEntity");
                return !pkd1Var.equals(pkd1VarB) ? new nql(false, xvj1.k("AdOnAppOpenEntity(com.spotify.adonappopen.repository.storage.AdOnAppOpenEntity).\n Expected:\n", pkd1Var, "\n Found:\n", pkd1VarB)) : new nql(true, (String) null);
            case 1:
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                linkedHashMap2.put("media_id", new mkd1(1, 1, "media_id", "TEXT", (String) null, true));
                pkd1 pkd1Var2 = new pkd1("OfflineLicenseInfoEntity", linkedHashMap2, xvj1.p(linkedHashMap2, "key_set_id", new mkd1(0, 1, "key_set_id", "TEXT", (String) null, true)), new LinkedHashSet());
                pkd1 pkd1VarB2 = syo1.B(y341Var, "OfflineLicenseInfoEntity");
                return !pkd1Var2.equals(pkd1VarB2) ? new nql(false, xvj1.k("OfflineLicenseInfoEntity(com.spotify.betamax.offline.database.OfflineLicenseInfoEntity).\n Expected:\n", pkd1Var2, "\n Found:\n", pkd1VarB2)) : new nql(true, (String) null);
            case 2:
                LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                linkedHashMap3.put("id", new mkd1(1, 1, "id", "INTEGER", (String) null, false));
                linkedHashMap3.put("from", new mkd1(0, 1, "from", "TEXT", (String) null, false));
                linkedHashMap3.put("deviceId", new mkd1(0, 1, "deviceId", "TEXT", (String) null, false));
                pkd1 pkd1Var3 = new pkd1("device_broadcasts", linkedHashMap3, xvj1.p(linkedHashMap3, "createdAt", new mkd1(0, 1, "createdAt", "INTEGER", (String) null, false)), new LinkedHashSet());
                pkd1 pkd1VarB3 = syo1.B(y341Var, "device_broadcasts");
                return !pkd1Var3.equals(pkd1VarB3) ? new nql(false, xvj1.k("device_broadcasts(com.ravelin.core.repository.broadcastsdb.entities.Broadcasts).\n Expected:\n", pkd1Var3, "\n Found:\n", pkd1VarB3)) : new nql(true, (String) null);
            case 3:
                LinkedHashMap linkedHashMap4 = new LinkedHashMap();
                linkedHashMap4.put("package_names", new mkd1(0, 1, "package_names", "TEXT", (String) null, true));
                linkedHashMap4.put("app_signatures", new mkd1(0, 1, "app_signatures", "TEXT", (String) null, true));
                pkd1 pkd1Var4 = new pkd1("cachedDenylist", linkedHashMap4, xvj1.p(linkedHashMap4, "timestamp", new mkd1(1, 1, "timestamp", "INTEGER", (String) null, true)), new LinkedHashSet());
                pkd1 pkd1VarB4 = syo1.B(y341Var, "cachedDenylist");
                return !pkd1Var4.equals(pkd1VarB4) ? new nql(false, xvj1.k("cachedDenylist(com.spotify.mediabrowserservice.allowlistpackagevalidator.denylist.cache.db.CachedDenylist).\n Expected:\n", pkd1Var4, "\n Found:\n", pkd1VarB4)) : new nql(true, (String) null);
            case 4:
                LinkedHashMap linkedHashMap5 = new LinkedHashMap();
                linkedHashMap5.put("deviceIdentifier", new mkd1(1, 1, "deviceIdentifier", "TEXT", (String) null, true));
                pkd1 pkd1Var5 = new pkd1("DeviceLastConnection", linkedHashMap5, xvj1.p(linkedHashMap5, "timestamp", new mkd1(0, 1, "timestamp", "INTEGER", (String) null, true)), new LinkedHashSet());
                pkd1 pkd1VarB5 = syo1.B(y341Var, "DeviceLastConnection");
                return !pkd1Var5.equals(pkd1VarB5) ? new nql(false, xvj1.k("DeviceLastConnection(com.spotify.connect.devicessortingimpl.data.DeviceLastConnection).\n Expected:\n", pkd1Var5, "\n Found:\n", pkd1VarB5)) : new nql(true, (String) null);
            case 5:
                LinkedHashMap linkedHashMap6 = new LinkedHashMap();
                linkedHashMap6.put("id", new mkd1(1, 1, "id", "INTEGER", (String) null, true));
                linkedHashMap6.put("authenticated", new mkd1(0, 1, "authenticated", "INTEGER", (String) null, false));
                linkedHashMap6.put("eventName", new mkd1(0, 1, "eventName", "TEXT", (String) null, false));
                linkedHashMap6.put("sequenceId", new mkd1(0, 1, "sequenceId", "BLOB", (String) null, false));
                linkedHashMap6.put("sequenceNumber", new mkd1(0, 1, "sequenceNumber", "INTEGER", (String) null, true));
                linkedHashMap6.put("fragments", new mkd1(0, 1, "fragments", "BLOB", (String) null, false));
                linkedHashMap6.put("owner", new mkd1(0, 1, "owner", "TEXT", (String) null, false));
                LinkedHashSet linkedHashSetP = xvj1.p(linkedHashMap6, "deviceId", new mkd1(0, 1, "deviceId", "TEXT", (String) null, false));
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                linkedHashSet.add(new okd1("index_Events_eventName", false, Collections.singletonList("eventName"), Collections.singletonList("ASC")));
                pkd1 pkd1Var6 = new pkd1("Events", linkedHashMap6, linkedHashSetP, linkedHashSet);
                pkd1 pkd1VarB6 = syo1.B(y341Var, "Events");
                if (!pkd1Var6.equals(pkd1VarB6)) {
                    return new nql(false, xvj1.k("Events(com.spotify.eventsender.eventsender.dao.EventEntity).\n Expected:\n", pkd1Var6, "\n Found:\n", pkd1VarB6));
                }
                LinkedHashMap linkedHashMap7 = new LinkedHashMap();
                linkedHashMap7.put("eventName", new mkd1(1, 1, "eventName", "TEXT", (String) null, true));
                linkedHashMap7.put("sequenceId", new mkd1(2, 1, "sequenceId", "BLOB", (String) null, true));
                pkd1 pkd1Var7 = new pkd1("EventSequenceNumbers", linkedHashMap7, xvj1.p(linkedHashMap7, "sequenceNumberNext", new mkd1(0, 1, "sequenceNumberNext", "INTEGER", (String) null, true)), new LinkedHashSet());
                pkd1 pkd1VarB7 = syo1.B(y341Var, "EventSequenceNumbers");
                if (!pkd1Var7.equals(pkd1VarB7)) {
                    return new nql(false, xvj1.k("EventSequenceNumbers(com.spotify.eventsender.eventsender.dao.EventSequenceNumberEntity).\n Expected:\n", pkd1Var7, "\n Found:\n", pkd1VarB7));
                }
                LinkedHashMap linkedHashMap8 = new LinkedHashMap();
                linkedHashMap8.put("eventName", new mkd1(1, 1, "eventName", "TEXT", (String) null, true));
                linkedHashMap8.put("count", new mkd1(0, 1, "count", "INTEGER", (String) null, true));
                pkd1 pkd1Var8 = new pkd1("RateLimitedEvents", linkedHashMap8, xvj1.p(linkedHashMap8, "timestamp", new mkd1(0, 1, "timestamp", "INTEGER", (String) null, true)), new LinkedHashSet());
                pkd1 pkd1VarB8 = syo1.B(y341Var, "RateLimitedEvents");
                return !pkd1Var8.equals(pkd1VarB8) ? new nql(false, xvj1.k("RateLimitedEvents(com.spotify.eventsender.ratelimiter.persisting.dao.RateLimitedEventEntity).\n Expected:\n", pkd1Var8, "\n Found:\n", pkd1VarB8)) : new nql(true, (String) null);
            case 6:
                LinkedHashMap linkedHashMap9 = new LinkedHashMap();
                linkedHashMap9.put("id", new mkd1(1, 1, "id", "TEXT", (String) null, true));
                linkedHashMap9.put("paths", new mkd1(0, 1, "paths", "TEXT", (String) null, true));
                linkedHashMap9.put("revision", new mkd1(0, 1, "revision", "INTEGER", (String) null, true));
                pkd1 pkd1Var9 = new pkd1("ExternalizationEnabledFilterEntity", linkedHashMap9, xvj1.p(linkedHashMap9, "format", new mkd1(0, 1, "format", "INTEGER", (String) null, true)), new LinkedHashSet());
                pkd1 pkd1VarB9 = syo1.B(y341Var, "ExternalizationEnabledFilterEntity");
                if (!pkd1Var9.equals(pkd1VarB9)) {
                    return new nql(false, xvj1.k("ExternalizationEnabledFilterEntity(com.spotify.puffin.core.data.filtermetadata.database.ExternalizationEnabledFilterEntity).\n Expected:\n", pkd1Var9, "\n Found:\n", pkd1VarB9));
                }
                LinkedHashMap linkedHashMap10 = new LinkedHashMap();
                linkedHashMap10.put("id", new mkd1(1, 1, "id", "TEXT", (String) null, true));
                linkedHashMap10.put("paths", new mkd1(0, 1, "paths", "TEXT", (String) null, true));
                linkedHashMap10.put("revision", new mkd1(0, 1, "revision", "INTEGER", (String) null, true));
                pkd1 pkd1Var10 = new pkd1("ExternalizationDisabledFilterEntity", linkedHashMap10, xvj1.p(linkedHashMap10, "format", new mkd1(0, 1, "format", "INTEGER", (String) null, true)), new LinkedHashSet());
                pkd1 pkd1VarB10 = syo1.B(y341Var, "ExternalizationDisabledFilterEntity");
                if (!pkd1Var10.equals(pkd1VarB10)) {
                    return new nql(false, xvj1.k("ExternalizationDisabledFilterEntity(com.spotify.puffin.core.data.filtermetadata.database.ExternalizationDisabledFilterEntity).\n Expected:\n", pkd1Var10, "\n Found:\n", pkd1VarB10));
                }
                LinkedHashMap linkedHashMap11 = new LinkedHashMap();
                linkedHashMap11.put("id", new mkd1(1, 1, "id", "TEXT", (String) null, true));
                linkedHashMap11.put("paths", new mkd1(0, 1, "paths", "TEXT", (String) null, true));
                linkedHashMap11.put("brand", new mkd1(0, 1, "brand", "TEXT", (String) null, true));
                linkedHashMap11.put("model", new mkd1(0, 1, "model", "TEXT", (String) null, true));
                linkedHashMap11.put("deviceFormattedName", new mkd1(0, 1, "deviceFormattedName", "TEXT", (String) null, true));
                linkedHashMap11.put("revision", new mkd1(0, 1, "revision", "INTEGER", (String) null, true));
                pkd1 pkd1Var11 = new pkd1("SpecificEnabledFilterEntity", linkedHashMap11, xvj1.p(linkedHashMap11, "format", new mkd1(0, 1, "format", "INTEGER", (String) null, true)), new LinkedHashSet());
                pkd1 pkd1VarB11 = syo1.B(y341Var, "SpecificEnabledFilterEntity");
                if (!pkd1Var11.equals(pkd1VarB11)) {
                    return new nql(false, xvj1.k("SpecificEnabledFilterEntity(com.spotify.puffin.core.data.filtermetadata.database.SpecificEnabledFilterEntity).\n Expected:\n", pkd1Var11, "\n Found:\n", pkd1VarB11));
                }
                LinkedHashMap linkedHashMap12 = new LinkedHashMap();
                linkedHashMap12.put("id", new mkd1(1, 1, "id", "TEXT", (String) null, true));
                linkedHashMap12.put("paths", new mkd1(0, 1, "paths", "TEXT", (String) null, true));
                linkedHashMap12.put("revision", new mkd1(0, 1, "revision", "INTEGER", (String) null, true));
                pkd1 pkd1Var12 = new pkd1("SpecificDisabledFilterEntity", linkedHashMap12, xvj1.p(linkedHashMap12, "format", new mkd1(0, 1, "format", "INTEGER", (String) null, true)), new LinkedHashSet());
                pkd1 pkd1VarB12 = syo1.B(y341Var, "SpecificDisabledFilterEntity");
                return !pkd1Var12.equals(pkd1VarB12) ? new nql(false, xvj1.k("SpecificDisabledFilterEntity(com.spotify.puffin.core.data.filtermetadata.database.SpecificDisabledFilterEntity).\n Expected:\n", pkd1Var12, "\n Found:\n", pkd1VarB12)) : new nql(true, (String) null);
            case 7:
                LinkedHashMap linkedHashMap13 = new LinkedHashMap();
                linkedHashMap13.put("id", new mkd1(1, 1, "id", "TEXT", (String) null, true));
                linkedHashMap13.put("title", new mkd1(0, 1, "title", "TEXT", (String) null, true));
                linkedHashMap13.put("position", new mkd1(0, 1, "position", "INTEGER", (String) null, true));
                pkd1 pkd1Var13 = new pkd1("liked_songs_filter_tags_entity", linkedHashMap13, xvj1.p(linkedHashMap13, "isSelected", new mkd1(0, 1, "isSelected", "INTEGER", (String) null, true)), new LinkedHashSet());
                pkd1 pkd1VarB13 = syo1.B(y341Var, "liked_songs_filter_tags_entity");
                return !pkd1Var13.equals(pkd1VarB13) ? new nql(false, xvj1.k("liked_songs_filter_tags_entity(com.spotify.listuxplatformconsumers.likedsongs.shared.filtertagsdata.FilterTagEntity).\n Expected:\n", pkd1Var13, "\n Found:\n", pkd1VarB13)) : new nql(true, (String) null);
            case 8:
                return a0(y341Var);
            case 9:
                return b0(y341Var);
            case 10:
                return c0(y341Var);
            case 11:
                LinkedHashMap linkedHashMap14 = new LinkedHashMap();
                linkedHashMap14.put("trigger", new mkd1(1, 1, "trigger", "TEXT", (String) null, true));
                linkedHashMap14.put("messageId", new mkd1(2, 1, "messageId", "INTEGER", (String) null, true));
                pkd1 pkd1Var14 = new pkd1("messages", linkedHashMap14, xvj1.p(linkedHashMap14, "message", new mkd1(0, 1, "message", "BLOB", (String) null, false)), new LinkedHashSet());
                pkd1 pkd1VarB14 = syo1.B(y341Var, "messages");
                if (!pkd1Var14.equals(pkd1VarB14)) {
                    return new nql(false, xvj1.k("messages(com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdkimpl.data.cache.room.TriggerAndMessage).\n Expected:\n", pkd1Var14, "\n Found:\n", pkd1VarB14));
                }
                LinkedHashMap linkedHashMap15 = new LinkedHashMap();
                linkedHashMap15.put("messageKey", new mkd1(1, 1, "messageKey", "TEXT", (String) null, true));
                pkd1 pkd1Var15 = new pkd1("message_id_and_capping", linkedHashMap15, xvj1.p(linkedHashMap15, "capping", new mkd1(0, 1, "capping", "BLOB", (String) null, false)), new LinkedHashSet());
                pkd1 pkd1VarB15 = syo1.B(y341Var, "message_id_and_capping");
                return !pkd1Var15.equals(pkd1VarB15) ? new nql(false, xvj1.k("message_id_and_capping(com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdkimpl.data.cache.room.MessageKeyAndCapping).\n Expected:\n", pkd1Var15, "\n Found:\n", pkd1VarB15)) : new nql(true, (String) null);
            case 12:
                return d0(y341Var);
            default:
                LinkedHashMap linkedHashMap16 = new LinkedHashMap();
                linkedHashMap16.put("work_spec_id", new mkd1(1, 1, "work_spec_id", "TEXT", (String) null, true));
                LinkedHashSet linkedHashSetP2 = xvj1.p(linkedHashMap16, "prerequisite_id", new mkd1(2, 1, "prerequisite_id", "TEXT", (String) null, true));
                linkedHashSetP2.add(new nkd1(Collections.singletonList("work_spec_id"), Collections.singletonList("id"), "WorkSpec", "CASCADE", "CASCADE"));
                linkedHashSetP2.add(new nkd1(Collections.singletonList("prerequisite_id"), Collections.singletonList("id"), "WorkSpec", "CASCADE", "CASCADE"));
                LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                linkedHashSet2.add(new okd1("index_Dependency_work_spec_id", false, Collections.singletonList("work_spec_id"), Collections.singletonList("ASC")));
                linkedHashSet2.add(new okd1("index_Dependency_prerequisite_id", false, Collections.singletonList("prerequisite_id"), Collections.singletonList("ASC")));
                pkd1 pkd1Var16 = new pkd1("Dependency", linkedHashMap16, linkedHashSetP2, linkedHashSet2);
                pkd1 pkd1VarB16 = syo1.B(y341Var, "Dependency");
                if (!pkd1Var16.equals(pkd1VarB16)) {
                    return new nql(false, xvj1.k("Dependency(androidx.work.impl.model.Dependency).\n Expected:\n", pkd1Var16, "\n Found:\n", pkd1VarB16));
                }
                LinkedHashMap linkedHashMap17 = new LinkedHashMap();
                linkedHashMap17.put("id", new mkd1(1, 1, "id", "TEXT", (String) null, true));
                linkedHashMap17.put("state", new mkd1(0, 1, "state", "INTEGER", (String) null, true));
                linkedHashMap17.put("worker_class_name", new mkd1(0, 1, "worker_class_name", "TEXT", (String) null, true));
                linkedHashMap17.put("input_merger_class_name", new mkd1(0, 1, "input_merger_class_name", "TEXT", (String) null, true));
                linkedHashMap17.put("input", new mkd1(0, 1, "input", "BLOB", (String) null, true));
                linkedHashMap17.put("output", new mkd1(0, 1, "output", "BLOB", (String) null, true));
                linkedHashMap17.put("initial_delay", new mkd1(0, 1, "initial_delay", "INTEGER", (String) null, true));
                linkedHashMap17.put("interval_duration", new mkd1(0, 1, "interval_duration", "INTEGER", (String) null, true));
                linkedHashMap17.put("flex_duration", new mkd1(0, 1, "flex_duration", "INTEGER", (String) null, true));
                linkedHashMap17.put("run_attempt_count", new mkd1(0, 1, "run_attempt_count", "INTEGER", (String) null, true));
                linkedHashMap17.put("backoff_policy", new mkd1(0, 1, "backoff_policy", "INTEGER", (String) null, true));
                linkedHashMap17.put("backoff_delay_duration", new mkd1(0, 1, "backoff_delay_duration", "INTEGER", (String) null, true));
                linkedHashMap17.put("last_enqueue_time", new mkd1(0, 1, "last_enqueue_time", "INTEGER", "-1", true));
                linkedHashMap17.put("minimum_retention_duration", new mkd1(0, 1, "minimum_retention_duration", "INTEGER", (String) null, true));
                linkedHashMap17.put("schedule_requested_at", new mkd1(0, 1, "schedule_requested_at", "INTEGER", (String) null, true));
                linkedHashMap17.put("run_in_foreground", new mkd1(0, 1, "run_in_foreground", "INTEGER", (String) null, true));
                linkedHashMap17.put("out_of_quota_policy", new mkd1(0, 1, "out_of_quota_policy", "INTEGER", (String) null, true));
                linkedHashMap17.put("period_count", new mkd1(0, 1, "period_count", "INTEGER", "0", true));
                linkedHashMap17.put("generation", new mkd1(0, 1, "generation", "INTEGER", "0", true));
                linkedHashMap17.put("next_schedule_time_override", new mkd1(0, 1, "next_schedule_time_override", "INTEGER", "9223372036854775807", true));
                linkedHashMap17.put("next_schedule_time_override_generation", new mkd1(0, 1, "next_schedule_time_override_generation", "INTEGER", "0", true));
                linkedHashMap17.put("stop_reason", new mkd1(0, 1, "stop_reason", "INTEGER", "-256", true));
                linkedHashMap17.put("trace_tag", new mkd1(0, 1, "trace_tag", "TEXT", (String) null, false));
                linkedHashMap17.put("backoff_on_system_interruptions", new mkd1(0, 1, "backoff_on_system_interruptions", "INTEGER", (String) null, false));
                linkedHashMap17.put("required_network_type", new mkd1(0, 1, "required_network_type", "INTEGER", (String) null, true));
                linkedHashMap17.put("required_network_request", new mkd1(0, 1, "required_network_request", "BLOB", "x''", true));
                linkedHashMap17.put("requires_charging", new mkd1(0, 1, "requires_charging", "INTEGER", (String) null, true));
                linkedHashMap17.put("requires_device_idle", new mkd1(0, 1, "requires_device_idle", "INTEGER", (String) null, true));
                linkedHashMap17.put("requires_battery_not_low", new mkd1(0, 1, "requires_battery_not_low", "INTEGER", (String) null, true));
                linkedHashMap17.put("requires_storage_not_low", new mkd1(0, 1, "requires_storage_not_low", "INTEGER", (String) null, true));
                linkedHashMap17.put("trigger_content_update_delay", new mkd1(0, 1, "trigger_content_update_delay", "INTEGER", (String) null, true));
                linkedHashMap17.put("trigger_max_content_delay", new mkd1(0, 1, "trigger_max_content_delay", "INTEGER", (String) null, true));
                LinkedHashSet linkedHashSetP3 = xvj1.p(linkedHashMap17, "content_uri_triggers", new mkd1(0, 1, "content_uri_triggers", "BLOB", (String) null, true));
                LinkedHashSet linkedHashSet3 = new LinkedHashSet();
                linkedHashSet3.add(new okd1("index_WorkSpec_schedule_requested_at", false, Collections.singletonList("schedule_requested_at"), Collections.singletonList("ASC")));
                linkedHashSet3.add(new okd1("index_WorkSpec_last_enqueue_time", false, Collections.singletonList("last_enqueue_time"), Collections.singletonList("ASC")));
                pkd1 pkd1Var17 = new pkd1("WorkSpec", linkedHashMap17, linkedHashSetP3, linkedHashSet3);
                pkd1 pkd1VarB17 = syo1.B(y341Var, "WorkSpec");
                if (!pkd1Var17.equals(pkd1VarB17)) {
                    return new nql(false, xvj1.k("WorkSpec(androidx.work.impl.model.WorkSpec).\n Expected:\n", pkd1Var17, "\n Found:\n", pkd1VarB17));
                }
                LinkedHashMap linkedHashMap18 = new LinkedHashMap();
                linkedHashMap18.put("tag", new mkd1(1, 1, "tag", "TEXT", (String) null, true));
                LinkedHashSet linkedHashSetP4 = xvj1.p(linkedHashMap18, "work_spec_id", new mkd1(2, 1, "work_spec_id", "TEXT", (String) null, true));
                linkedHashSetP4.add(new nkd1(Collections.singletonList("work_spec_id"), Collections.singletonList("id"), "WorkSpec", "CASCADE", "CASCADE"));
                LinkedHashSet linkedHashSet4 = new LinkedHashSet();
                linkedHashSet4.add(new okd1("index_WorkTag_work_spec_id", false, Collections.singletonList("work_spec_id"), Collections.singletonList("ASC")));
                pkd1 pkd1Var18 = new pkd1("WorkTag", linkedHashMap18, linkedHashSetP4, linkedHashSet4);
                pkd1 pkd1VarB18 = syo1.B(y341Var, "WorkTag");
                if (!pkd1Var18.equals(pkd1VarB18)) {
                    return new nql(false, xvj1.k("WorkTag(androidx.work.impl.model.WorkTag).\n Expected:\n", pkd1Var18, "\n Found:\n", pkd1VarB18));
                }
                LinkedHashMap linkedHashMap19 = new LinkedHashMap();
                linkedHashMap19.put("work_spec_id", new mkd1(1, 1, "work_spec_id", "TEXT", (String) null, true));
                linkedHashMap19.put("generation", new mkd1(2, 1, "generation", "INTEGER", "0", true));
                LinkedHashSet linkedHashSetP5 = xvj1.p(linkedHashMap19, "system_id", new mkd1(0, 1, "system_id", "INTEGER", (String) null, true));
                linkedHashSetP5.add(new nkd1(Collections.singletonList("work_spec_id"), Collections.singletonList("id"), "WorkSpec", "CASCADE", "CASCADE"));
                pkd1 pkd1Var19 = new pkd1("SystemIdInfo", linkedHashMap19, linkedHashSetP5, new LinkedHashSet());
                pkd1 pkd1VarB19 = syo1.B(y341Var, "SystemIdInfo");
                if (!pkd1Var19.equals(pkd1VarB19)) {
                    return new nql(false, xvj1.k("SystemIdInfo(androidx.work.impl.model.SystemIdInfo).\n Expected:\n", pkd1Var19, "\n Found:\n", pkd1VarB19));
                }
                LinkedHashMap linkedHashMap20 = new LinkedHashMap();
                linkedHashMap20.put("name", new mkd1(1, 1, "name", "TEXT", (String) null, true));
                LinkedHashSet linkedHashSetP6 = xvj1.p(linkedHashMap20, "work_spec_id", new mkd1(2, 1, "work_spec_id", "TEXT", (String) null, true));
                linkedHashSetP6.add(new nkd1(Collections.singletonList("work_spec_id"), Collections.singletonList("id"), "WorkSpec", "CASCADE", "CASCADE"));
                LinkedHashSet linkedHashSet5 = new LinkedHashSet();
                linkedHashSet5.add(new okd1("index_WorkName_work_spec_id", false, Collections.singletonList("work_spec_id"), Collections.singletonList("ASC")));
                pkd1 pkd1Var20 = new pkd1("WorkName", linkedHashMap20, linkedHashSetP6, linkedHashSet5);
                pkd1 pkd1VarB20 = syo1.B(y341Var, "WorkName");
                if (!pkd1Var20.equals(pkd1VarB20)) {
                    return new nql(false, xvj1.k("WorkName(androidx.work.impl.model.WorkName).\n Expected:\n", pkd1Var20, "\n Found:\n", pkd1VarB20));
                }
                LinkedHashMap linkedHashMap21 = new LinkedHashMap();
                linkedHashMap21.put("work_spec_id", new mkd1(1, 1, "work_spec_id", "TEXT", (String) null, true));
                LinkedHashSet linkedHashSetP7 = xvj1.p(linkedHashMap21, "progress", new mkd1(0, 1, "progress", "BLOB", (String) null, true));
                linkedHashSetP7.add(new nkd1(Collections.singletonList("work_spec_id"), Collections.singletonList("id"), "WorkSpec", "CASCADE", "CASCADE"));
                pkd1 pkd1Var21 = new pkd1("WorkProgress", linkedHashMap21, linkedHashSetP7, new LinkedHashSet());
                pkd1 pkd1VarB21 = syo1.B(y341Var, "WorkProgress");
                if (!pkd1Var21.equals(pkd1VarB21)) {
                    return new nql(false, xvj1.k("WorkProgress(androidx.work.impl.model.WorkProgress).\n Expected:\n", pkd1Var21, "\n Found:\n", pkd1VarB21));
                }
                LinkedHashMap linkedHashMap22 = new LinkedHashMap();
                linkedHashMap22.put("key", new mkd1(1, 1, "key", "TEXT", (String) null, true));
                pkd1 pkd1Var22 = new pkd1("Preference", linkedHashMap22, xvj1.p(linkedHashMap22, "long_value", new mkd1(0, 1, "long_value", "INTEGER", (String) null, false)), new LinkedHashSet());
                pkd1 pkd1VarB22 = syo1.B(y341Var, "Preference");
                return !pkd1Var22.equals(pkd1VarB22) ? new nql(false, xvj1.k("Preference(androidx.work.impl.model.Preference).\n Expected:\n", pkd1Var22, "\n Found:\n", pkd1VarB22)) : new nql(true, (String) null);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ss0(AdOnAppOpenDatabase_Impl adOnAppOpenDatabase_Impl) {
        super(3, "106ce4a6cfbfc04cb25a6859bdb67a32", "2c4b08e9804e6a65172ab6daa515d101");
        this.e = adOnAppOpenDatabase_Impl;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ss0(BetamaxOfflineDatabase_Impl betamaxOfflineDatabase_Impl) {
        super(1, "c68c2249dd78211e654e1cab770c092a", "966db6b5e8546a50443b734c18cd28d8");
        this.e = betamaxOfflineDatabase_Impl;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ss0(DevicePickerSortingDatabase_Impl devicePickerSortingDatabase_Impl) {
        super(1, "914d67f6f529727de34d02b66c756daf", "35110f9adf249772dd17e1baf16948e8");
        this.e = devicePickerSortingDatabase_Impl;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ss0(FilterTagsDatabase_Impl filterTagsDatabase_Impl) {
        super(2, "0c3ff92392f1da458f90ce11b6d17155", "486b7232de5fc4e1b3825c60ba7c9e9d");
        this.e = filterTagsDatabase_Impl;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ss0(LyricsDatabase_Impl lyricsDatabase_Impl) {
        super(4, "83ba4b521ff031f5afee46484a2872a2", "c48a0345afd7ba5e707932b2f8caef02");
        this.e = lyricsDatabase_Impl;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ss0(DenylistDatabase_Impl denylistDatabase_Impl) {
        super(1, "d67ac72aa4a8cece7aedacad51645ca8", "9388f9efdfb94c058e57cbc972da0efd");
        this.e = denylistDatabase_Impl;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ss0(RecentLocationsDatabase_Impl recentLocationsDatabase_Impl) {
        super(1, "bbf535ccb3ed5f2bcd07c8331dbb6312", "32827bf2dc87994e42be87a945335cf9");
        this.e = recentLocationsDatabase_Impl;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ss0(HistoryDatabase_Impl historyDatabase_Impl) {
        super(6, "5c6117641afdcc11643f1fe5464500c1", "018546a152ef5ad9718196b5d50ea573");
        this.e = historyDatabase_Impl;
    }

    private final void A() {
    }

    private final void B() {
    }

    private final void C() {
    }

    private final void D() {
    }

    private final void E() {
    }

    private final void F() {
    }

    private final void G() {
    }

    private final void H() {
    }

    private final void I() {
    }

    private final void J() {
    }

    private final void K() {
    }

    private final void L() {
    }

    private final void M() {
    }

    private final void N() {
    }

    private final void O() {
    }

    private final void P() {
    }

    private final void Q() {
    }

    private final void R() {
    }

    private final void S() {
    }

    private final void T() {
    }

    private final void U() {
    }

    private final void V() {
    }

    private final void W() {
    }

    private final void X() {
    }

    private final void Y() {
    }

    private final void Z() {
    }

    private final void y() {
    }

    private final void z() {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ss0(MessagesDatabase_Impl messagesDatabase_Impl) {
        super(11, "067516dddca80bf1e21a8b3464f03d6c", "f3c6df77f560439b29eee2dc82c74d58");
        this.e = messagesDatabase_Impl;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ss0(HeadphoneFilterStateDatabase_Impl headphoneFilterStateDatabase_Impl) {
        super(5, "599a4d2e3a4ade6df569e65f3f00ce91", "0cb686d5406117a187b4661d3f17f871");
        this.e = headphoneFilterStateDatabase_Impl;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ss0(FilterMetadataDatabase_Impl filterMetadataDatabase_Impl) {
        super(5, "9626ba88a5701636a14778c5d67830e5", "a5886dc7e8b981495953a2ca8a27c66a");
        this.e = filterMetadataDatabase_Impl;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ss0(EventSenderDatabase_Impl eventSenderDatabase_Impl) {
        super(11, "c6ffea087c1eb57023f5bbcc2c41e2ce", "3d91887fb6006f9b1f27d9dd076d75bd");
        this.e = eventSenderDatabase_Impl;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ss0(BroadcastsDatabase_Impl broadcastsDatabase_Impl) {
        super(1, "1d606c2b4db3d84a5744e2cdfb443d5c", "7aedbbbeebf99a6d733cceb6610d70bf");
        this.e = broadcastsDatabase_Impl;
    }
}
